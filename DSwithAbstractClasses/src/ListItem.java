package DSwithAbstractClasses.src;

public abstract class ListItem {
    // write code here

    protected ListItem rightLink = null, leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem next();

    public abstract ListItem setNext(ListItem rightLink);

    public abstract ListItem previous();

    public abstract ListItem setPrevious(ListItem leftLink);

    public abstract int compareTo(ListItem compareItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

class Node extends ListItem {
    // write code here

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem rightLink) {
        this.rightLink = rightLink;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem compareItem) {
        if (compareItem != null) {
            String currValue = (String) super.getValue();
            String otherValue = (String) compareItem.getValue();
            return currValue.compareTo(otherValue);
        }
        return -1;
    }
}

class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if (root == null) {
            this.root = item;
            return true;
        }

        ListItem head = root;

        while (head != null) {
            int comparision = head.compareTo(item);

            if (comparision < 0) {
                if (head.next() != null) {
                    head = head.next();
                } else {
                    head.setNext(item).setPrevious(head);
                    return true;
                }
            } else if (comparision > 0) {
                if (head.previous() != null) {
                    head.previous().setNext(item);
                    item.setPrevious(head.previous());
                    item.setNext(head);
                    head.setPrevious(item);
                    return true;

                } else {
                    item.setNext(root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem head = root;
        while (head != null) {
            int comparision = head.compareTo(item);

            if (comparision == 0) {
                if (head == this.root) {
                    this.root = head.next();
                } else {
                    head.previous().setNext(head.next());
                    if (head.next() != null) {
                        head.next().setPrevious(head.previous());
                    }
                }
                head.previous().setNext(head.next());
                head.next().setPrevious(head.previous());
            } else if (comparision < 0) {
                head = head.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}

interface NodeList {

    public ListItem getRoot();

    public boolean addItem(ListItem root);

    public boolean removeItem(ListItem root);

    public void traverse(ListItem root);
}

class SearchTree implements NodeList {

    ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {

            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {

        if (item.next() == null) {

            if (parent.next() == item) {

                parent.setNext(item.previous());
            } else if (parent.previous() == item) {

                parent.setPrevious(item.previous());
            } else {

                this.root = item.previous();
            }
        } else if (item.previous() == null) {

            if (parent.next() == item) {

                parent.setNext(item.next());
            } else if (parent.previous() == item) {

                parent.setPrevious(item.next());
            } else {

                this.root = item.next();
            }
        } else {

            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }

            item.setValue(current.getValue());

            if (leftmostParent == item) {

                item.setNext(current.next());
            } else {

                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem item) {

    }
}

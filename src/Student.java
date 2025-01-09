class Student {
    private String Id;
    private String Name;
    private String DateOfBirth;
    private String classList;

    public Student(String Id, String Name, String DateOfBirth, String classList) {
        this.Id = Id;
        this.Name = Name;
        this.DateOfBirth = DateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" + 
                "id = '" + Id + '\'' +
                ", name = '" + Name + '\'' +
                ", dateOfBirth = '" + DateOfBirth + '\'' +
                ", classList = '" + classList + '\'' +
                "}";
    }

    // getter
    public String getId() {
        return this.Id;
    }
    public String getDOB() {
        return this.DateOfBirth;
    }
    public String getName() {
        return this.Name;
    }
    public String getClassList() {
        return this.classList;
    }

    // setters
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setDOB(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public void setClassList(String classList) {
        this.classList = classList;
    }
}
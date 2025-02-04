public class App {
    public static void main(String... args) throws Exception {

        System.out.println("Hello World");

        String[] splitString = "Hello World Again".split(" ");
        printText(splitString);

        System.out.println("-".repeat(20));
        printText("Hello");

        System.out.println("-".repeat(20));
        printText("Hello");

        System.out.println("-".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("-".repeat(20));
        printText();
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}

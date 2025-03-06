public class MyT extends Thread {

    public void run() {
        System.out.println("I am run function of the runnable interface" + i++);
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyT());
        t.start();
    }
}
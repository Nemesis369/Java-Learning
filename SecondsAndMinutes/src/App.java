public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    // to find the minutes and the remaining seconds
    public static String getDurationString(int minutes, int seconds) {
        String hours = Integer.toString(minutes / 60);
        String minuteString = Integer.toString(minutes % 60);
        String secondsString = Integer.toString(seconds);
        return hours + "h" + " " + minuteString + "m" + " " + secondsString + "s";
    }
}

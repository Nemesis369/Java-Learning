package EnumProject.src.dev.lpa;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Days weekDay = Days.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            // System.out.printf("Name is %s, Ordinal value = %d\n", weekDay.name(),
            // weekDay.ordinal());

            // if (weekDay == Days.FRI) {
            // System.out.println("Found a Friday!!");
            // }

            switchDayOfWeek(weekDay);
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfWeek(Days weekDay) {
        int weekDayInt = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInt);
            case SAT -> System.out.println("Saturday is Day " + weekDayInt);
            default -> System.out.println(
                    weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInt);
        }
    }

    public static Days getRandomDay() {
        int randomInt = new Random().nextInt(7);
        var allDays = Days.values();

        return allDays[randomInt];
    }
}

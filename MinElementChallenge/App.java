package MinElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = readIntegers();
        Arrays.toString(arr);

        System.out.println(findMin(arr));
    }

    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split(",");
        int[] values = new int[arr.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(arr[i].trim());
        }

        sc.close();
        return values;
    }

    public static int findMin(int... arr) {
        int minAns = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minAns = Math.min(minAns, arr[i]);
        }

        return minAns;
    }
}

package ArrayReferences;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[6];
        int[] anotherArr = arr;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(anotherArr));

        anotherArr[0] = 1;
        modifyArray(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(anotherArr));
    }

    // passing a reference of that object
    private static void modifyArray(int[] arr) {
        arr[1] = 2;
    }
}

package dev.ak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 45;
        intArray[1] = 1;
        intArray[5] = 50;

        double[] doubleArray = new double[10];
        doubleArray[2] = 3.5;
        System.out.println(doubleArray[2]);

        int[] firstTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        // newArray = new int[] { 5, 4, 3, 2, 1 };
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        // for (int i = 0; i < newArray.length; i++) {
        // System.out.print(newArray[i] + " ");
        // }
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(newArray);

        System.out.println(Arrays.toString(newArray));
        // String str = Arrays.toString(new int[2]);
        // System.out.println(str);

        Object object = newArray;
        if (object instanceof int[]) {
            System.out.println("object is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
    }
}

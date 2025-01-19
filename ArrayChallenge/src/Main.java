import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = createRandom(10);
        System.out.println(Arrays.toString(arr));

        int[] sortedArr = sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] createRandom(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1000);
        }

        return arr;
    }

    public static int[] sort(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] < sortedArr[j]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(sortedArr));
        }
        return sortedArr;
    }
}

class SortedArray {
    // write code here
    public static int[] getIntegers(int len) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArr) {
        int[] sortedArr = Arrays.copyOf(unsortedArr, unsortedArr.length);
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] < sortedArr[j]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(sortedArr));
        }
        return sortedArr;
    }
}

package data.structures.and.algorithms;

public class ArrayReverse {
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];
        int count = 0;
        for (int x = arr.length - 1; x >= 0; x--) {
            reversedArray[count] = arr[x];
            count++;
        }
        return reversedArray;
    }
}

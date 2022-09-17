package lesson2;

import java.util.Arrays;

public class methods9 {
    public static void main(String[] args){
        printArray(fillArray(4,8));
    }
    public static void printArray(int[] array){
            System.out.println(Arrays.toString(array));
    }
    public static int[] fillArray(int len, int initialValue ) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}

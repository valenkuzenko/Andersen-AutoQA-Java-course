package lesson2;

import java.util.Arrays;

public class methods6 {
    public static void main(String[] args){
        int[] arr = new int[100];
        systemOut(Arrays.toString(methods6.fillArray(arr)));
    }
    public static void systemOut(String filledArray) {
        System.out.println(filledArray);
    }
    public static int[] fillArray(int[] args){
        for(int i = 0; i < args.length; i++) {
                args[i] = i + 1;
        }
        return args;
    }
}

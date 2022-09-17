package lesson2;

import java.util.Arrays;

public class methods5 {
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1};
        systemOut(Arrays.toString(methods5.onesAndZeroes(arr)));
    }
    public static void systemOut(String changedArray) {
        System.out.println(changedArray);
    }
    public static int[] onesAndZeroes(int[] args){
        for(int i = 0; i < args.length; i++) {
            if (args[i] == 1){
                args[i] = 0;
            } else if (args[i] == 0) {
                args[i] = 1;
            }
        }
        return args;
    }

}

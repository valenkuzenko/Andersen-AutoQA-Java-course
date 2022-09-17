package lesson2;

import java.util.Arrays;

public class methods7 {
    public static void main(String[] args){
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        systemOut(Arrays.toString(methods7.multipliedWithConditionArray(arr)));
    }
    public static void systemOut(String multipliedWithConditionArray) {
        System.out.println(multipliedWithConditionArray);
    }
    public static int[] multipliedWithConditionArray(int[] args){
        for(int i = 0; i < args.length; i++) {
            if (args[i] < 6){
                args[i] = args[i] * 2;
            }
        }
        return args;
    }
}

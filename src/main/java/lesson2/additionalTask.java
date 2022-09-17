package lesson2;

import java.util.Arrays;

public class additionalTask {
    public static void main(String[] args){
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        int n = -3;
        systemOut(Arrays.toString(multipliedWithConditionArray(arr, n)));
    }
    public static void systemOut(String multipliedWithConditionArray) {
        System.out.println(multipliedWithConditionArray);
    }
    public static int[] multipliedWithConditionArray(int[] args, int n){
        // if n > 0, go to the left
        for (int j = 0; j < Math.abs(n); j++) {
            if(n > 0){
                int tmp = args[0];
                for (int i = 0; i < args.length - 1; i++) {
                    args[i] = args[i + 1];
                }
                args[args.length - 1] = tmp;
            } else {
                int tmp = args[args.length - 1];
                for (int i = args.length - 1; i > 0; i--) {
                    args[i] = args[i - 1];
                }
                args[0] = tmp;
            }
        }
        return args;
    }
}

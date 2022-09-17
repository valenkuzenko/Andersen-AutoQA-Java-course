package lesson2;

import java.util.Arrays;

public class methods8 {
    public static void main(String[] args){
        onesInDiagonalsArray();
    }
    public static void printArray(int[][] array){
        for (int[] row : array){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void onesInDiagonalsArray(){
        int[][] args = new int [5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                if (i == j || j == args.length - 1 - i){
                    args[i][j] = 1;
                } else {
                    args[i][j] = 0;}
            }
        }
        printArray(args);
    }
}

package lesson2;

public class methods1 {

    public static void main(String[] args){
       systemOut(methods1.sumValue(-2,29));
    }

    public static void systemOut(boolean sumValue) {
        System.out.println(sumValue);
    }

    public static boolean sumValue(int a, int b){
        int c = a + b;
        return (c > 10 && c <= 20);
    }
}

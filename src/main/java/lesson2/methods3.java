package lesson2;

public class methods3 {
    public static void main(String[] args){
        systemOut(methods3.signBool(-4));
    }
    public static void systemOut(boolean signBool) {
        System.out.println(signBool);
    }
    public static boolean signBool(int a){
        return (a < 0);
    }
}

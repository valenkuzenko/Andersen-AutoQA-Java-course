package lesson2;

public class methods2 {
    public static void main(String[] args){
        signWillBePrinted(-2);
    }
    public static void signWillBePrinted(int a){
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}

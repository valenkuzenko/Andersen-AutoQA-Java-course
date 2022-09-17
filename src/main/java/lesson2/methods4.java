package lesson2;

public class methods4 {

    public static void main(String[] args) {
        repeatedTextWithIf("Go party", 3);
        repeatedTextWithFor("It's your Birthday", 3);
        systemOut(methods4.isThisALeapYear(2044));
    }
    public static void repeatedTextWithIf(String text, int quantity) {
        System.out.println(text);
        if (quantity > 1) {
            repeatedTextWithIf(text, quantity - 1);
        }
    }
    public static void repeatedTextWithFor(String text, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }

    public static boolean isThisALeapYear(int year){
        return (year % 4 == 0 || year % 400 == 0);
    }
    public static void systemOut(boolean isThisALeapYear) {
        System.out.println(isThisALeapYear);
    }
}
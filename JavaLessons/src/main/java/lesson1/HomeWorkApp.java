package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Melon");
    }
    public static void  checkSumSign() {
        int x=8, y=15;
        if ((x+y)>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value=-200;
        if (value<=0){
            System.out.println("Red");
        }
        if (value>0 && value<=100){
            System.out.println("Yellow");
        }
        if (value>100){
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a=17, b=-17;
        if (a>=b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 1,b = -2;
        System.out.println("Сравнение чисел");
        if (a+b>0){
            System.out.println("Сумма положительная");
            System.out.println(a);
        } else{
            System.out.println("Сумма отрицательная");
            System.out.println(b);
        }
    }
    public static void printColor() {
        int value =-10;
        if (value<=0){
            System.out.println("Красный");
        }
        if(value>0&&value<100) {
            System.out.println("Желтый");
        }
        if(value>=100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a=1,b=3;
        if(a>=b){
            System.out.println("a>=b");
        }else{
            if(a<b){
                System.out.println("a<b");
            }
        }
    }
}
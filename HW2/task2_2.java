package HW2.HW2;


public class task2_2 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        example();
    }
    public static void example(){
        try {
            int[] Array = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double result = Array[8] / d;
            System.out.println("Result= " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
        }

    }
    }

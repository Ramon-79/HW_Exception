package HW2.HW2;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task2_1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите вещественное число: ");
            try{
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно: %f\n", fNumber);
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод. Введите вещественное число!");
            }

        }
    }
}
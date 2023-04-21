
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2_4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текст кроме пустой строки");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

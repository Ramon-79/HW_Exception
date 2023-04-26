package base.classes.ui;
import base.abstractClasses.AGetData;
import base.exceptions.GetDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CGetData extends AGetData {
    BufferedReader reader;

    public CGetData() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getData() throws IOException {
        String text = """
                Введите данные разделенные пробелом:
                Фамилия Имя Отчество дата_рождения номер_телефона пол.
                                
                Форматы данных:
                Фамилия Имя Отчество - строки.            
                Дата рождения - строка формата dd.mm.yyyy.           
                Номер телефона - целые числа.
                Пол - символ f или m.
                """;
        System.out.println(text);
        System.out.print("Введите данные: ");
        String data = "";
        try {
            data = this.reader.readLine();
        }catch (IOException e){
            throw new GetDataException(new IOException());
        }
        return data;
    }
}
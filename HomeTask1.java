/* Задание 1
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
(типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    public static float getFloat() {
        try (Scanner scanner = new Scanner(System.in)) {
            String prompt1 = "Введите дробное число: ";
            String prompt2 = "Введенное число не дробное. ";

            // через nextLine
            while (true) {
                System.out.print(prompt1);
                String s = scanner.nextLine();
                while (!s.matches("^\\d+[.]\\d+$|^[.]\\d+$|\\d+")) {    // допустимые варианты: 123.56 || .56 || 123
                    System.out.print(prompt2 + prompt1);
                    s = scanner.next();
                }
                return Float.parseFloat(s);

            }

        }

    }

}
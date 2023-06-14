/*  Задание 4
    4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    Далее запросить повторный ввод строки.
 */

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        System.out.println("Вы ввели: " + checkLine());
    }

    public static String checkLine() {
        try (Scanner scanner = new Scanner(System.in)) {
            String prompt1 = "Введите строку: ";
            String prompt2 = "Пустые строки вводить нельзя. ";
            while (true) {
                System.out.print(prompt1);
                String line = scanner.nextLine();
                while (line.isEmpty()) {
                    System.out.print(prompt2 + prompt1);
                    line = scanner.nextLine();
                }
                return line;
            }
        }

    }
}

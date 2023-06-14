/*  Задание 2
    2. Если необходимо, исправьте данный код
 */
public class HomeTask2 {
    public static void main(String[] args) {
        int[] intArray = new int[9];    // добавлена инициализация массива intArray
        try {
            int d = 1;  // было d = 0
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


}

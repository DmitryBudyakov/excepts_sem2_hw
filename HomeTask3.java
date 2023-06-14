/*  Задание 3
    3. Дан следующий код, исправьте его там, где требуется
 */

public class HomeTask3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
//            int[] abc = { 1, 2 }; // в исходном варианте
            int[] abc = { 1, 2, 3, 4 };
            abc[3] = 9;
//        } catch (Throwable ex) {  // в исходном варианте
        } catch (ArithmeticException ex) {  // на случай, если b = 0
            System.out.println("Что-то пошло не так... Делить на 0 нельзя.");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) { //throws FileNotFoundException {    // в исходном варианте
        System.out.println(a + b);
    }
}

public class Lesson2Task4 {
    public static void main(String[] args) {

        int n = 234;
        int firstNumber = n / 100;
        int secondNumber = (n % 100) / 10;
        int thirdNumber = n % 10;
        int result = firstNumber + secondNumber + thirdNumber;
        System.out.println(result);
    }
}
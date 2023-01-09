public class Lesson4Task4 {
    public static void main(String[] args) {
        int firstFactor = 1;
        int secondFactor = 1;
        int product = 0;
        while (firstFactor <= 10) {
            while (secondFactor <= 10) {
                product = firstFactor * secondFactor;
                System.out.println(firstFactor + " * " + secondFactor + " = " + product);
                secondFactor++;
            }
            firstFactor++;
            secondFactor = 1;
        }
    }
}

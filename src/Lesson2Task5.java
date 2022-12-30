public class Lesson2Task5 {
    public static void main(String[] args) {
        double number = 23.23;
        int b = (int) number;
        if (b == number)
            System.out.println(number + " - число не вещественное");
        else
            System.out.println(number + " - число вещественное");
    }
}

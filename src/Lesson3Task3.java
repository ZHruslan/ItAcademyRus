public class Lesson3Task3 {
    public static void main(String[] args) {
        int hour = 22;
        if (hour >= 22 || hour < 6) {
            System.out.println("Good night!");
        } else if (hour >= 6 & hour < 12) {
            System.out.println("Good morning!");
        } else  if (hour >= 12 & hour < 18) {
            System.out.println("Good day");
        } else if (hour >= 18 & hour < 22){
            System.out.println("Good evening!");
        }
    }
}
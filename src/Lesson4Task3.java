public class Lesson4Task3 {
    public static void main(String[] args) {
        int fibonachi = 1;
        int cikl = 0;
        while (cikl < 10) {
            System.out.println(fibonachi);
            fibonachi = fibonachi + fibonachi;
            cikl++;
        }
    }
}
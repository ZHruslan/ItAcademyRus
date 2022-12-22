public class Lesson4Task4 {
    public static void main(String[] args) {
        int mnozhitel1 = 1;
        int mnozhitel2 = 1;
        int proizvedenie = 0;
        while (mnozhitel1 <= 10) {
            while (mnozhitel2 <= 10){
                proizvedenie = mnozhitel1 * mnozhitel2;
                System.out.println(mnozhitel1 + " * " + mnozhitel2 + " = " + proizvedenie);
                mnozhitel2++;
            }
            mnozhitel1++;
            mnozhitel2 = 1;
        }
    }
}
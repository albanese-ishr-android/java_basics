public class Sequences {
    public static void main(String[] args) {

        System.out.println(collatzLength(43));
    }

    public static int collatzLength(int n) {
        int length = 0;
        if (n == 1) {
            return 1;
        } else {
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    length = length + 1;
                } else {
                    n = 3 * n + 1;
                    length = length + 1;
                }
            }

        }

        return length;
    }
}

public class Recursion {
    public static void main(String[] args) {
        //int denominator = gcd(121231, 73);
        //System.out.println(denominator);
        hanoi(19, 'A', 'C', 'B');
    }


    public static int gcd(int m, int n){
        if(m == n){
            return n;
        } else if(m < n){
            return gcd(m, n-m);
        } else{
            return gcd(m-n, n);
        }
    }

    public static void hanoi(int n, char from, char to, char excl){

        if(n == 1){
            System.out.println("Move from: " + from + " to " + to);
        }else {
            hanoi(n-1, from, excl, to);
            hanoi(1, from, to, excl);
            hanoi(n-1, excl, to, from);

        }

    }


}

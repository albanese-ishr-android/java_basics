public class RecursiveAlgorithms {

    public static void main(String[] args) {
        System.out.println(power(3,8));
        System.out.println(powerLoop(3, 8));
    }


    public static long power(int a, int b){
        if(b == 1){
            return a;
        }else if(b == 0){
            return 1;
        } else {
            return a * power(a, b-1);
        }
    }

    public static long powerLoop(int a, int b){
        long product = 1;
        for(int count = 0; count < b; count++){
            product = product * a;
        }

        return product;
    }


}

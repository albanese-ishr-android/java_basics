public class IncorrectAlgorithms {
    public static void main(String[] args) {
        commonFactor();
    }


    /*
    The following method is supposed to output the common factors of two numbers. There is an error in the logic. You need to find the error and correct it.
     */
    public static void commonFactor() {
        int numberOne = 14;
        int numberTwo = 12;

        System.out.println("The common factors of: " + numberOne + " and " + numberTwo + " are: "); //The error is not here.
        //HINT the error is in the next three lines.
        for (int count = 1; count <= numberTwo; count = count + 1) {
            if ((numberOne % count == 0) || (numberTwo % count == 0)) {
                System.out.println(count);
            }
        }


    }
}

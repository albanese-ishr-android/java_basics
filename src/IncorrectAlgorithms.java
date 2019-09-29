public class IncorrectAlgorithms {
    public static void main(String[] args) {
        commonFactor();
        commonElements();
    }


    /*
    The following method is supposed to output the common factors of two numbers. There is an error in the logic. You need to find the error and correct it.
    TODO: Find the error and fix it.
     */
    public static void commonFactor() {
        int numberOne = 14;
        int numberTwo = 12;

        System.out.println("The common factors of: " + numberOne + " and " + numberTwo + " are: "); //The error is not here.
        /*

         */
        for (int count = 1; count <= numberTwo; count = count + 1) {
            if ((numberOne % count == 0) && (numberTwo % count == 0)) { //Both numbers need to be divisible. So use the && for AND
                System.out.println(count);
            }
        }

    }


    /*
    The following method is supposed to find the common elements of two arrays. There is a logic error. Find it and correct it.
    TODO: Find the error and fix it.
     */
    public static void commonElements() {
        String[] arrayOne = {"aa", "11", "34", "ff", "mm"}; //The numbers in these arrays are considered strings because they are in quotes.
        String[] arrayTwo = {"ff", "hh", "mn", "33", "34"};

        System.out.println("The following elements are in both arrays: ");

        for (int i = 0; i < arrayOne.length; i = i + 1) { //HINT: i is the counter for each of the items in arrayOne

            for (int j = 0; j < arrayTwo.length; j = j + 1) { //HINT: j is the counter for each of the items in arrayTwo
                if (arrayOne[i] == arrayTwo[j]) { //Change the index to j because j is the index keeping track of the position of arrayTwo.
                    System.out.println(arrayTwo[j]);
                }
            }


        }
    }
}

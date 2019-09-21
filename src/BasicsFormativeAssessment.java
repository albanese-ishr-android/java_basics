public class BasicsFormativeAssessment {

    /*
    I've declared a main() function for you. This is the function that the Java interpreter uses to start the programs. You
    don't need to put anything in here. I will run your programs to test the output.
     */
    public static void main(String[] args) {
        usingVariables();
        goingLoopy();
        logicalComparisons();

    }
    /*
    Please complete the TODOs in this file. I will use this to assess your basic Java Skills.
     */


    public static void usingVariables() {
        //TODO (1) -- Declare three variables and initialize them with a value. One variable should be a string, a float, a boolean, and an integer.


        //TODO (2) -- Use System.out.println() to print the values of the variables.

    }

    public static void goingLoopy() {
        /*
        This is to check your ability to write for and while loops.
         */

        //TODO (3) - Write a for loop that will print the first 25 multiples of 2.
        //The output should be 2, 4, 6, 8 ... 50


        //TODO (4) - Fix the while loop. This while loop will run forever. Fix it so that it stops.
        //HINT: The loop is supposed to countdown from 100.
        int x = 100;

        while (x < 100) {
            System.out.println(x);
        }

    }


    public static void logicalComparisons() {
        /*
        In this exercise, you will use if, then, and elif statements to control the flow of the program.
         */

        int a = 100;
        int b = 232;
        int c = 27;

        //TODO (5) -- Write a program using if and elif statements that does the following tasks:
        // - It prints "a is bigger than b" if a is larger than b
        // - It prints "b is larger than a" if b is larger than a.
        // - It prints "b is larger than a and c is pretty small" if b is larger than a AND c is less than 10
        // - Otherwise, it will print "Nothing for me to do.

    }


    public static void arraysOfFun() {
        /*
        Here's a couple of arrays for you to play with.
         */
        int[] anIntegerArray = {5, 7, 8, 3, 6, 3};
        String[] aStringArray = {"Winner", "Winner", "Chicken dinner"};

        //TODO (6) -- Use the System.out.println() to display the 3rd element in anIntegerArray

        //TODO (7) -- Use the .length method to determine the number of elements in aStringArray and store it in a variable called size

        //TODO (8) -- Challenge: Use a for loop to cycle through all the elements of aStringArray and print each element to the screen.
        //HINT: The output should be "Winner Winner Chicken Dinner"

    }
}

import java.util.Random;

public class PassangerArrayHL {

    static int[][] twoDimensionalArray = new int[30][7];
    static int[] passengers = new int[210];

    public static void main(String[] args) {
        generatePassengerData(passengers);
        sortPassengerTwoDimensionalArray();
    }


    public static void sortPassengerTwoDimensionalArray() {
        int currentPassengerArrayIndex = 0;

        //This block of code sorts the data into a two dimensional array : 30 weeks as rows and 7 columns as days.
        while (currentPassengerArrayIndex < passengers.length) {

            int currentWeek = currentPassengerArrayIndex / 7;
            int currentDay = currentPassengerArrayIndex % 7;

            twoDimensionalArray[currentWeek][currentDay] = passengers[currentPassengerArrayIndex];
            currentPassengerArrayIndex = currentPassengerArrayIndex + 1;
            System.out.println("Week: " + currentWeek + "\tDay: " + currentDay + "\tPassengers: " + twoDimensionalArray[currentWeek][currentDay]);
        }

    }

    /*
    This method loads some random generated data into the passenger array.
     */
    public static void generatePassengerData(int[] array) {
        for (int i = 0; i < array.length; i++) {

            Random r = new Random();

            array[i] = r.nextInt((400 - 200) + 1) + 200;
            System.out.println(i + "\t" + array[i]);
        }

    }

}

import java.util.Random;

public class PassangerArrayHL {
    public static void main(String[] args) {
        passengerData();
    }


    public static void passengerData() {
        int[][] twoDimensionalArray = new int[30][7];
        int[] passengers = new int[210];
        generatePassengerData(passengers);
        int day = 0;
        int currentPassengerArrayIndex = 0;

        while (currentPassengerArrayIndex < passengers.length) {
            int currentWeek = currentPassengerArrayIndex / 7;
            int currentDay = currentPassengerArrayIndex % 7;

            twoDimensionalArray[currentWeek][currentDay] = passengers[currentPassengerArrayIndex];
            currentPassengerArrayIndex = currentPassengerArrayIndex + 1;

            System.out.println("Week: " + currentWeek + "\tDay: " + currentDay + "\tPassengers: " + twoDimensionalArray[currentWeek][currentDay]);
        }


    }

    public static void generatePassengerData(int[] array) {
        for (int i = 0; i < array.length; i++) {

            Random r = new Random();

            array[i] = r.nextInt((400 - 200) + 1) + 200;
            System.out.println(i + "\t" + array[i]);
        }

    }

}

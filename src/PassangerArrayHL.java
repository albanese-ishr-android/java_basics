

public class PassangerArrayHL {
    public static void main(String[] args) {

    }


    public static void passengerData() {
        int[][] twoDimensionalArray = new int[30][7];
        int[] passengers = new int[210];
        int day = 0;
        for (int i = 0; i < 30; i = i + 1) {//Outer loop for the weeks.

            for (int j = 0; j < passengers.length; j = j + 7) {//Inner loop for each weekday in passengers

                if (j < 6) {
                    day = j;
                } else {
                    day = j % 7;
                }

                twoDimensionalArray[i][day] = passengers[j];
            }


        }

    }

    public static void generatePassengerData(int[] array) {
        for (int i = 0; i < array.length; i++) {

            array[i] =
        }

    }

}

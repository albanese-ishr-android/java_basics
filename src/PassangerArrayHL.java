import java.util.Random;

public class PassangerArrayHL {

    static int[][] twoDimensionalArray = new int[30][7];
    static int[] passengers = new int[210];
    static double[] fees = {2.70, 1.80};

    public static void main(String[] args) {
        generatePassengerData(passengers);
        sortPassengerTwoDimensionalArray(); //Solution to 15a
        int myTotal = total(5); // Solution to 15b
        System.out.println(myTotal);
        System.out.println(findHighestAverage()); //Solution to 15c
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


    public static int total(int columnNumber) {
        int sum = 0;
        if (columnNumber <= 6) {
            for (int week = 0; week < twoDimensionalArray.length; week++) {
                sum = sum + twoDimensionalArray[week][columnNumber];
            }
        }
        return sum;

    }

    public static String findHighestAverage() {
        float maximumAverage = 0;
        int maximumDay = 0;

        for (int day = 0; day < 6; day++) {
            float currentAverage = total(day) / twoDimensionalArray.length;
            if (currentAverage > maximumAverage) {
                maximumAverage = currentAverage;
                maximumDay = day;
            }
        }
        return "The highest average passenger day is: " + convert(maximumDay) + " with value: " + maximumAverage;
    }

    public static double salesCalculate(int startWeek, int startDay, int endWeek, int endDay) {
        double totalSales = 0;

        for (int week = startWeek; week <= endDay; week++) {
            for (int day = startDay; day <= endDay; day++) {

                if (day >= 5) { //If the day is a Saturday or Sunday
                    double currentDaySales = twoDimensionalArray[day][week] * fees[1];
                    totalSales = totalSales + currentDaySales;
                } else {
                    double currentDaySales = twoDimensionalArray[day][week] * fees[0];
                }
            }
        }

        return totalSales;
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

    /*
    This is the method that converts the integer days to strings.
     */
    public static String convert(int day) {
        switch (day) {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return " ";
        }
    }
}

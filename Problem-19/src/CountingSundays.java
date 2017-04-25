/**
 * Created by jphillips3 on 24/04/2017.
 * Entire program runs in only 1 millisecond (thus the call to print running time in Nano-Seconds).
 * Program also has scaleability to be expanded beyond 1901 to 2000 time frame. 
 */
public class CountingSundays {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int runningSundayTotal = 0;
        int currentDay = 2;
        for (int i = 1901; i <= 2000; i++) {
            int[] currentYearStats = yearLoop(currentDay, i);
            runningSundayTotal += currentYearStats[1];
            currentDay = currentYearStats[0];
        }
        System.out.println("The total amount of Sundays falling on the first of the month is: " + runningSundayTotal);
        long endTime = System.nanoTime();
        long runningTime = endTime - startTime;
        System.out.println("The total running time is: " + runningTime + " nanoseconds.");
    }

    public static int[] yearLoop(int currentDay, int currentYear) {
        /**
         * This method takes the first day of the year and loops through what every day falls on.
         * It returns two variables, the number of Sundays that fall on the first of the month, and the current day for the next year to begin on.
         */
        int[] days = {1, 2, 3, 4, 5, 6, 7};
        boolean isLeapYear = isLeapYear(currentYear);
        int numberOfSundays = 0;
        int daysOfMonth = 31;
        //loops through months
        for (int month = 1; month <= 12; month++) {
            if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8)
                || (month == 10) || (month ==12)) {
                daysOfMonth = 31;
            }
            else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                daysOfMonth = 30;
            }
            else if ((month == 2) && !isLeapYear) {
                daysOfMonth = 28;
            }
            else if ((month == 2) && isLeapYear) {
                daysOfMonth = 29;
            }

            //Loops through individual days for the month
            for (int day = 1; day <= daysOfMonth; day++) {
                currentDay = (days[(currentDay-1)%7]);
                currentDay++;

                if (day == 1 && currentDay == 7) {
                    numberOfSundays++;
                }
            }
        }
        return new int[] {currentDay, numberOfSundays};
    }

    public static boolean isLeapYear(int currentYear) {
        if (currentYear % 4 == 0) {
            if (!(currentYear % 100 == 0) || (currentYear % 400 == 0)) {
                return true;
            }
        }
            return false;
    }
}

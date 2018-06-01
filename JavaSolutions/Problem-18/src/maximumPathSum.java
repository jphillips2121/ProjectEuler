import java.util.HashMap;
import java.util.Map;

/**
 * Created by jphillips3 on 24/04/2017.
 *
 * This is a brute force method to complete the problem
 * The 'path' that is taken each iteration is determined by a large 14 digit binary number
 * Each value in the binary sequence determines whether the next number is down and to the left, or to the right
 * 0 represents a step to the left, whilst 1 represents a step to the right.
 * By evaluating the path for every binary number between 0 and 11111111111111 each possible path is evaluated.
 */
public class maximumPathSum {
    public static void main(String[] args) {
        Map<Integer, int[]> rows = setRows();

        int largestTotal = 0;
        int numberOfRows = 15;
        int[] currentRow;

        //Loops until all row movements are 1, i.e: all movements are pointing 'right'
        for (int i = 0B000; i <= 0B11111111111111; i++) {
            int currentColumn = 0;
            int currentRowIndex = 2;
            int total = 75;
            String pathRoute = setBinary(i, numberOfRows - 1);
            for (int j = 0; j < (pathRoute.length()); j++) {
                int currentMove = Character.getNumericValue(pathRoute.charAt(j));
                currentRow = rows.get(currentRowIndex);
                if (currentMove == 0) {
                    total += currentRow[currentColumn];
                }
                else {
                    //Move down and to the right
                    currentColumn++;
                    total += currentRow[currentColumn];
                }
                currentRowIndex ++;
            }
            if (total > largestTotal) {
                largestTotal = total;
            }
        }
        System.out.println(largestTotal);
    }

    public static Map setRows() {
        Map<Integer, int[]> rows = new HashMap<>();

        int[] row1 = {75};
        int[] row2 = {95, 64};
        int[] row3 = {17, 47, 82};
        int[] row4 = {18, 35, 87, 10};
        int[] row5 = {20, 04, 82, 47, 65};
        int[] row6 = {19, 01, 23, 75, 03, 34};
        int[] row7 = {88, 02, 77, 73, 07, 63, 67};
        int[] row8 = {99, 65, 04, 28, 06, 16, 70, 92};
        int[] row9 = {41, 41, 26, 56, 83, 40, 80, 70, 33};
        int[] row10 = {41, 48, 72, 33, 47, 32, 37, 16, 94, 29};
        int[] row11 = {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14};
        int[] row12 = {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57};
        int[] row13 = {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48};
        int[] row14 = {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31};
        int[] row15 = {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23};

        rows.put(1, row1);
        rows.put(2, row2);
        rows.put(3, row3);
        rows.put(4, row4);
        rows.put(5, row5);
        rows.put(6, row6);
        rows.put(7, row7);
        rows.put(8, row8);
        rows.put(9, row9);
        rows.put(10, row10);
        rows.put(11, row11);
        rows.put(12, row12);
        rows.put(13, row13);
        rows.put(14, row14);
        rows.put(15, row15);

        return rows;
    }

    public static String setBinary(int num, int length){
        /**
         * This method ensures that the binary number is displayed in a correct format so that if it
         * starts with a '0', that zero is not removed as is the default in Java.
         * I.E; 001001 would normally only display as 1001, which is not usable in this program.
         */
        if ((Integer.toString(num, 2).length() == length)) {
            return Integer.toString(num, 2);
        }
        else {
            //Sets binaryCompleteValue to the number of "0's" that need to be added to the front of string to make it a usable binary map
            int binaryCompleteValue = (length) - (Integer.toString(num, 2).length());
            String binaryValueOfInt = "";
            for (int i = 1; i <= binaryCompleteValue; i ++) {
                binaryValueOfInt += "0";
            }
            return binaryValueOfInt + Integer.toString(num, 2);
        }
    }
}

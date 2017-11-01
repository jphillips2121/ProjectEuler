/**
 * Created by jphillips3 on 01/11/2017.
 */
public class IntegerRightTriangles {
    public static void main(String[] args) {
        int mostSolutions = 0;
        int mostSolutionsAnswer = 0;
        for (int i = 1; i <= 1000; i++) {
            if (generateNumberOfSolutions(i) > mostSolutions) {
                mostSolutions = generateNumberOfSolutions(i);
                mostSolutionsAnswer = i;
            }
        }
        System.out.println(mostSolutionsAnswer + " has the most solutions");
    }

    public static int generateNumberOfSolutions(int p) {
        int numberOfSolutions = 0;
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p; j++) {
                int k = p - i - j;
                /**
                 * Check if pythagorean theory is true
                 */
                if (((i*i) + (j*j)) == (k*k)) {
                    numberOfSolutions += 1;
                }
            }
        }
        return numberOfSolutions;
    }
}

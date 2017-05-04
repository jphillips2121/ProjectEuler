/**
 * Created by jphillips3 on 04/05/2017.
 */
public class quadraticPrimes {
    public static void main(String[] args) {
        int highestPrimeNumberCount = 0;
        int highestCoeffAnumber = 0;
        int highestCoeffBnumber = 0;
        for (int coeffA = -1000; coeffA <= 1000; coeffA++) {
            for (int coeffB = -1000; coeffB <= 1000; coeffB++) {
                int primeNumberCount = getHighestPrime(coeffA, coeffB);
                if (primeNumberCount > highestPrimeNumberCount) {
                    highestPrimeNumberCount = primeNumberCount;
                    highestCoeffAnumber = coeffA;
                    highestCoeffBnumber = coeffB;
                }
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("The Highest Coefficient of A is " + highestCoeffAnumber + ". And the Highest Coefficient of B is " + highestCoeffBnumber + ".");
        System.out.println("This gives a total coefficient product of " + highestCoeffAnumber*highestCoeffBnumber);
    }

    public static int getHighestPrime(int coeffA, int coeffB) {
        int primeCount = 0;
        int i = 1;
        boolean prime = true;
        while(prime) {
            int quadraticResult = (int)(Math.pow(i, 2)) + (coeffA * i) + coeffB;
            if (checkPrime(quadraticResult)) {
                prime = true;
                primeCount++;
                i++;
            }
            else {
                prime = false;
                break;
            }
        }
        return primeCount + 1;
    }

    public static boolean checkPrime(int num) {
        if (num < 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

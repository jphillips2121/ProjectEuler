/**
 * Created by jphillips3 on 03/03/2017.
 */
public class PythagTriplets {




    public static void main(String[] args) {
        boolean answer = false;
        int i = 1;
        int aAnswer = 1;
        int bAnswer = 2;
        int cAnswer = 3;
        while (!answer) {
            for (int j = (i + 1); j < i*i; j++) {
                for (int k = (j + 1); k < i*i; k++) {
                    if ((i + j + k) == 1000 && ((i*i + j*j) == (k*k))) {
                        answer = true;
                        aAnswer = i;
                        bAnswer = j;
                        cAnswer = k;
                        break;
                    }
                }
            }
        i += 1;
        }
        System.out.print("A value is " + aAnswer + ", B value is " + bAnswer + ", and C value is " + cAnswer);
        System.out.print(". The product of these three values is:" + aAnswer * bAnswer * cAnswer);
    }
}

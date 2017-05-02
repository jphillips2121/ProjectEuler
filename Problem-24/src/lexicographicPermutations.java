/**
 * Created by jphillips3 on 26/04/2017.
 */
public class lexicographicPermutations {
    public static void main(String[] args) {
        String sequence = "0123456789";
        System.out.println("Starting number is " + sequence);

        for (int i = 1; i < 1000000; i++) {
            nonIncreasingSuffix currentSequence = new nonIncreasingSuffix(sequence);
            String pivotPointLocation = currentSequence.pivotPointLocation;
            String successorLocation = currentSequence.successorLocation;
            String swappedSequence = swapPivotAndSuccessor(sequence, pivotPointLocation, successorLocation);
            sequence = reverseSuffix(swappedSequence, currentSequence.nonIncreasingSuffixString);
        }

        System.out.println("The one millionth Lexicographic Permutation is... " + sequence);
    }

    public static String swapPivotAndSuccessor(String sequence, String pivotPointLocation, String successorLocation) {
        /**
         * Swaps the Pivot number and Successor number
         */
        char[] seqArray = sequence.toCharArray();
        char pivotPointValue = seqArray[Integer.parseInt(pivotPointLocation)];
        char successorLocationValue = seqArray[Integer.parseInt(successorLocation)];
        String seq2Array = sequence.substring(0, Integer.parseInt(pivotPointLocation)) + successorLocationValue + sequence.substring((Integer.parseInt(pivotPointLocation)) + 1);
        return seq2Array.substring(0, Integer.parseInt(successorLocation)) + pivotPointValue + seq2Array.substring((Integer.parseInt(successorLocation)) + 1);

    }

    public static String reverseSuffix(String sequence, String suffix) {
        /**
             * Returns the final sequence with the suffix reversed.
         * Note: The 'Sequence' string in this function is the sequence generated from swapPivotAndSuccessor.
         */
        int suffixLength = suffix.length();
        String newSuffix = sequence.substring(sequence.length() - suffixLength, sequence.length());
        String reversedSuffix = new StringBuilder(newSuffix).reverse().toString();
        return (sequence.substring(0, (sequence.length() - suffixLength)) + reversedSuffix);

    }
}

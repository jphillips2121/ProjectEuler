import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jphillips3 on 01/11/2017.
 */
public class CodedTriangleNumbers {
    public static List<Integer> triangleNumbersList = new ArrayList<>();
    public static void main(String[] args) {
        String[] listOfWords = readFromTxtFile();
        generateTriangleNumbers(400);
        int totalTriangleWords = 0;
        for (String w : listOfWords) {
            if (triangleNumbersList.contains(generateValueForWord(w))) {
                totalTriangleWords += 1;
            }
        }
        System.out.println(totalTriangleWords);
    }

    public static void generateTriangleNumbers(int upperLimit) {
        int currentTriangleNumber = 1;
        float i = 1;
        while (currentTriangleNumber <= upperLimit) {
            currentTriangleNumber = (int)((i/2) * (i + 1));
            triangleNumbersList.add(currentTriangleNumber);
            i += 1;
        }
    }

    public static int generateValueForWord(String word) {
        int total = 0;
        for(char c : word.toCharArray()) {
            total += ((int)c) - 64;
        }
        return total;
    }

    public static String[] readFromTxtFile() {
        List<String> stringValuesList = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File("/Users/jphillips3/IdeaProjects/ProjectEuler/Problem-42/src/p042_words.txt"));
            input.useDelimiter(",");
            while (input.hasNext()) {
                String s = input.next();
                stringValuesList.add(s.substring(1,s.length()-1));
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }
        String[] stringValues = new String[stringValuesList.size()];
        return stringValuesList.toArray(stringValues);
    }
}

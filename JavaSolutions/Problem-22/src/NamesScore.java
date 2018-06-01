import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jphillips3 on 25/04/2017.
 */
public class NamesScore {
    public static void main(String[] args) throws IOException{
        //Imports name file as String
        String names = new String(Files.readAllBytes(Paths.get("/Users/jphillips3/IdeaProjects/ProjectEuler/Problem-22/src/p022_names.txt")));
        //Removes quotation marks from String
        names = names.replace("\"", "");
        //Seperates String by comma's and puts it into a list then orders it alphabetically
        List<String> orderedNames = Arrays.asList(names.split("\\s*,\\s*"));
        Collections.sort(orderedNames);

        BigInteger runningTotal = BigInteger.ZERO;
        for (int i = 0; i <= orderedNames.size()-1; i++) {
            runningTotal = runningTotal.add(getNameScore(i + 1, orderedNames.get(i)));
        }
        System.out.println(runningTotal);
    }

    public static BigInteger getNameScore(int index, String name) {
        int stringTotal = 0;
        for (char c : (name.toLowerCase()).toCharArray()) {
            stringTotal += (int)c - 96;
        }

        return BigInteger.valueOf(index * stringTotal);
    }
}

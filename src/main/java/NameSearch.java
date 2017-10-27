import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by laptop on 12.10.17.
 */
public class NameSearch {

    public List searchInFile(String name) throws IOException {
        List<Integer> result = new ArrayList<Integer>();
        FileReader fileReader = new FileReader("/home/laptop/Workspace/nameSearch/searchName.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<String, Integer> mostRepeatWords = new HashMap<String, Integer>();
        String line;
        int lineNumber = 0;
        while ((line = bufferedReader.readLine()) != null) {


            line.toLowerCase().contains(name);
            ++lineNumber;
            if (line.contains(name) == true) {
                result.add(lineNumber);

            }

        }

        System.out.println(result);

        return result;
    }

    public Map<String, Integer> takeNamesFromFile() throws IOException {
        FileReader fileReader = new FileReader("/home/laptop/Workspace/nameSearch/searchName.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<String, Integer> mostRepeatWords = new HashMap<String, Integer>();
        String addName;
        while ((addName = bufferedReader.readLine()) != null) {

            String[] splitWords = addName.split(" ");
            for (String words : splitWords) {
                if (mostRepeatWords.get(words) == null) {
                    mostRepeatWords.put(words, 1);
                } else {
                    int actualCount = mostRepeatWords.get(words);
                    mostRepeatWords.put(words, ++actualCount);
                }

            }

        }

        return mostRepeatWords;

    }
}










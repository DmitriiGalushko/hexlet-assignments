package exercise;

import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String charSet, String word) {
        char[] charSetArr = charSet.toLowerCase().toCharArray();
        char[] wordArr = word.toLowerCase().toCharArray();
        List<char[]> charSetList = Arrays.asList(charSetArr);
        List<char[]> wordList = Arrays.asList(wordArr);

        for (char[] ch : charSetList) {
            if (wordList.contains(ch)) {
                wordList.remove(ch);
            } else {
                return false;
            }
        }
        return wordList.isEmpty();
    }
}
//END

package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String charSet, String word) {
        char[] charSetArr = charSet.toCharArray();
        char[] wordArr = word.toCharArray();
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

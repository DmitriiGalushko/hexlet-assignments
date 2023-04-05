package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String charSet, String word) {
        var rightWord = word.toLowerCase();
        char[] charSetArr = charSet.toCharArray();
        char[] wordArr = rightWord.toCharArray();
        List<char[]> charSetList = new ArrayList<>(Arrays.asList(charSetArr));
        List<char[]> wordList = new ArrayList<>(Arrays.asList(wordArr));

        for (char[] ch : wordList) {
            if (charSetList.contains(ch)) {
                wordList.remove(ch);
            } else {
                return false;
            }
        }
        return wordList.isEmpty();
    }
}
//END

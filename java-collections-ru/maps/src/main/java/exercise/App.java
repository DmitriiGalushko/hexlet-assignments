package exercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (sentence.isEmpty()) {
                wordCount.putAll(Collections.emptyMap());
            } else if (!wordCount.containsKey(word)) {
                wordCount.put(word, 0);
            }
            wordCount.put(word, wordCount.get(word) + 1);
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet())
            result.append("\n" + "  ").append(entry.getKey()).append(": ").append(entry.getValue().toString());
        return "{" + result + "\n}";
    }
}
//END

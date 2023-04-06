package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbol, String word) {
        word = word.toLowerCase();
        String[] wordSymbol = word.split("");
        String[] symbols = symbol.split("");
        ArrayList<String> listWordSymbol = new ArrayList<>(Arrays.asList(wordSymbol));
        ArrayList<String> listSymbol = new ArrayList<>(Arrays.asList(symbols));

        for (String s : listSymbol) {
            if (listWordSymbol.contains(s)) {
                listWordSymbol.remove(s);
            }
        }
        return listWordSymbol.isEmpty();
    }
}
//END

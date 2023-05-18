package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {

        Map<String, String> difference = new LinkedHashMap<>();
        Set <String> keys = new TreeSet<>(data1.keySet());
        keys.addAll(data2.keySet());

        for(String key : keys) {
            if (!data1.containsKey(key)) {
                difference.put(key, "added");
            } else if (!data2.containsKey(key)) {
                difference.put(key, "deleted");
            } else if (data1.get(key).equals(data2.get(key))) {
                difference.put(key, "unchanged");
            } else {
                difference.put(key, "changed");
            }
        }

        return difference;
    }
}
//END

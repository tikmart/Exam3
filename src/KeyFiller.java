import java.util.*;

public class KeyFiller {
    static Set keySeparator(Map<String, Integer> map) {
        Set<String> keys = new HashSet<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 50) {
                keys.add(entry.getKey());
            }
        }


        return keys;
    }
}

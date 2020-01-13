package roud2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Args {
    Map<String, String> map = new HashMap<>();

    public Args(String input) {
        Iterator<String> argIterator = Arrays.asList(input.split("\\s+")).listIterator();
        while (argIterator.hasNext()) {
            String name = argIterator.next();
            if (argIterator.hasNext()) {
                String value = argIterator.next();
                if (value.charAt(0) != '-') {
                    map.put(name, value);
                }
            }
        }
    }

    public String getValue(String key) {
        return map.get(key);
    }
}
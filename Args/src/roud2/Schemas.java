package roud2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schemas {
    Map<String, String> map = new HashMap<>();

    public Schemas(String input) {
        Arrays.asList(input.split(",")).stream().forEach(optionDefaultValuePair -> {
            String[] optionDefaultValue = optionDefaultValuePair.split(":");
            map.put(optionDefaultValue[0], optionDefaultValue[1]);
        });
    }

    public String getDefaultValue(String key) {
        return map.get(key);
    }

    public boolean contains(String name) {
        return map.keySet().contains(name);
    }
}

package roud2;

import jdk.nashorn.internal.ir.WhileNode;

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
}

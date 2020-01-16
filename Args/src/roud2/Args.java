package roud2;

import java.util.*;

public class Args {
    Map<String, String> map = new HashMap<>();
    Schemas schemas;

    public Args(String input, Schemas schemas) {
        this.schemas = schemas;
        ListIterator<String> argIterator = Arrays.asList(input.split("\\s+")).listIterator();
        while (argIterator.hasNext()) {
            String name = argIterator.next();
            if (isOption(name)) {
                if (argIterator.hasNext()) {
                    String value = argIterator.next();
                    if (!isOption(value)) {
                        map.put(name, value);
                    } else {
                        map.put(name, schemas.getDefaultValue(name));
                        argIterator.previous();
                    }
                } else {
                    map.put(name, schemas.getDefaultValue(name));
                }
            }
        }
    }

    private boolean isOption(String name) {
        return name.charAt(0) == '-' && schemas.contains(name);
    }

    public String getValue(String key) {
        return map.get(key);
    }

}
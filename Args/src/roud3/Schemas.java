package roud3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schemas {
    Map<String, String> map = new HashMap<>();

    public Schemas(String initialParameter) {
        Arrays.stream(initialParameter.split(",")).forEach(singleParam ->
                {
                    String[] singleParamPair = singleParam.split(":");
                    map.put(singleParamPair[0], singleParamPair[1]);
                }
        );
    }

    public Schemas() {
    }

    public int getSize() {
        return map.size();
    }

    public String getValue(String option) {
        return map.get(option);
    }

    public void put(String option, String value) {
        map.put(option, value);
    }
}

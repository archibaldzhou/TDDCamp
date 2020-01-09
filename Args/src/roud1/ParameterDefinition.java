package roud1;

public class ParameterDefinition {


    public String getOption() {
        return option;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getType() {
        return type;
    }

    private String option;
    private String defaultValue;
    private String type;

    public ParameterDefinition(String option, String defaultValue, String type) {
        this.option = option;
        this.defaultValue = defaultValue;
        this.type = type;
    }
}

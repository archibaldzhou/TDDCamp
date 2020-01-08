package roud1;

public class Parameter {
    String option;
    String value;

    public Parameter(String opt, String val) {
        this.option = opt;
        this.value = val;
    }

    public String getOption() {
        return this.option;
    }

    public String getValue() {
        return this.value;
    }
}

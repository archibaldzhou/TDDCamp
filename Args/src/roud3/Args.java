package roud3;


import java.util.Arrays;

public class Args {
    public Schemas getDefaultSchema() {
        return defaultSchema;
    }

    private Schemas defaultSchema;

    public Args(String defaultSchema) {
        this.defaultSchema = new Schemas(defaultSchema);
    }

    public Schemas parse(String s) {
        return new Schemas();
    }
}

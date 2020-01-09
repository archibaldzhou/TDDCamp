package roud1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Args {

    private Args() {
    }

    public Args(List<ParameterDefinition> list) {
        this.parameterDefinitions = list;
    }

    public List<ParameterDefinition> parameterDefinitions = new ArrayList<>();

    public List<Parameter> parse(String inputString) {
        List<Parameter> list = new ArrayList<>();
        String argPairs[] = inputString.split("-");
        Arrays.stream(argPairs).filter(argPair -> notEmptyArgPair(argPair)).forEach((argPair) -> {
            Parameter parameter = parseSingleArgPairToParameter(argPair);
            list.add(parameter);
        });
        list.stream().forEach((parameter -> {
            if (!parameterDefinitions.stream().anyMatch(parameterDefinition -> parameterDefinition.getOption().equals(parameter.getOption()))) {
                throw new RuntimeException("Illegal option");
            }

        }));
        return list;
    }

    private boolean notEmptyArgPair(String argPair) {
        return argPair.length() > 0;
    }

    private Parameter parseSingleArgPairToParameter(String argPair) {
        String args[] = argPair.split(" ");
        String option = "";
        String value = "";

        if (isValidArg(args)) {
            option = args[0];
            value = isDefaultValueArg(args) ? "0" : args[1];
        }
        return new Parameter(option, value);
    }

    private boolean isDefaultValueArg(String[] args) {
        return args.length == 1;
    }

    private static boolean isValidArg(String[] args) {
        return args.length >= 1;
    }
}

package roud1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Args {

    private Args() {
    }

    public Args(List<Parameter> list) {
        this.supportedParameters = list;
    }

    public List<Parameter> supportedParameters = new ArrayList<>();

    public List<Parameter> parse(String inputString) {
        List<Parameter> list = parseInputStringToParameterList(inputString);

        list.stream().forEach((parameter -> {
            if (!supportedParameters.stream().anyMatch(parameterDefinition -> parameterDefinition.getOption().equals(parameter.getOption()))) {
                throw new RuntimeException("Illegal option");
            }
            if (parameter.getValue().equals("")) {
                parameter.value = supportedParameters.stream().filter(supportedParameter -> parameter.getOption().equals(supportedParameter.getOption())).findFirst().get().getValue();
            }

        }));
        return list;
    }

    private List<Parameter> parseInputStringToParameterList(String inputString) {
        List<Parameter> list = new ArrayList<>();
        String argPairs[] = inputString.split("-");
        Arrays.stream(argPairs).filter(argPair -> notEmptyArgPair(argPair)).forEach((argPair) -> {
            Parameter parameter = parseArgPairToParameter(argPair);
            list.add(parameter);
        });
        return list;
    }

    private boolean notEmptyArgPair(String argPair) {
        return argPair.length() > 0;
    }

    private Parameter parseArgPairToParameter(String argPair) {
        String args[] = argPair.split(" ");
        String option = "";
        String value = "";

        if (isValidArg(args)) {
            option = args[0];
            value = args.length == 2 ? args[1] : "";
        }
        return new Parameter(option, value);
    }

    private String getDefaulValue(String option) {
        String defaultValue = "";
        if (supportedParameters.stream().anyMatch(parameter -> parameter.getOption().equals(option))) {
            defaultValue = supportedParameters.stream().filter(parameter -> parameter.getOption().equals(option)).findFirst().get().getValue();
        }
        return defaultValue;
    }

    private boolean isDefaultValueArg(String[] args) {
        return args.length == 1;
    }

    private static boolean isValidArg(String[] args) {
        return args.length == 1 || args.length == 2;
    }
}

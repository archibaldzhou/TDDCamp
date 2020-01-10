package roud1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArgsTest {

    Args args;

    @BeforeEach
    public void initial() {
        List<Parameter> list = new ArrayList<>();
        list.add(new Parameter("P", "0"));
        list.add(new Parameter("d", "/"));
        args = new Args(list);
    }

    @Test
    public void given_P8080_should_P_8080() {

        Assertions.assertEquals(1, args.parse("-P 8080").size());
        for (Parameter parameter : args.parse("-P 8080")) {
            Assertions.assertEquals("P", parameter.getOption());
            Assertions.assertEquals("8080", parameter.getValue());
        }
    }

    @Test
    public void given_2_Parameter() {
        List<Parameter> parameterList = args.parse("-P 8080 -d /usr/args");
        Assertions.assertEquals(2, parameterList.size());
        Optional<Parameter> firstParam = parameterList.stream().findFirst();
        Assertions.assertEquals("P", firstParam.get().getOption());
        Assertions.assertEquals("8080", firstParam.get().getValue());
        Optional<Parameter> secondParam = parameterList.stream().parallel().filter(parameter -> parameter.option.equals("d")).findAny();
        Assertions.assertEquals("d", secondParam.get().getOption());
        Assertions.assertEquals("/usr/args", secondParam.get().getValue());
    }

    @Test
    public void given_only_option_should_Default_Value() {

        List<Parameter> list = new ArrayList<>();
        list.add(new Parameter("P", "0"));
        list.add(new Parameter("d", "/"));
        list.add(new Parameter("B", "false"));
        args = new Args(list);
        List<Parameter> parameterList = args.parse("-P -d -B");
        Assertions.assertEquals(3, parameterList.size());

        Assertions.assertEquals("false", parameterList.stream().filter(parameter -> parameter.getOption().equals("B")).findFirst().get().getValue());
        Assertions.assertEquals("/", parameterList.stream().filter(parameter -> parameter.getOption().equals("d")).findFirst().get().getValue());
        Assertions.assertEquals("0", parameterList.stream().filter(parameter -> parameter.getOption().equals("P")).findFirst().get().getValue());
    }

    @Test
    public void given_invalid_option_should_return_error() {
        Exception exceptionZ = Assertions.assertThrows(RuntimeException.class, () -> {
            args.parse("-Z 99");
        });
        Assertions.assertEquals("Illegal option", exceptionZ.getMessage());
        Exception exceptionY = Assertions.assertThrows(RuntimeException.class, () -> {
            args.parse("-Y 99");
        });
        Assertions.assertEquals("Illegal option", exceptionY.getMessage());

    }
}

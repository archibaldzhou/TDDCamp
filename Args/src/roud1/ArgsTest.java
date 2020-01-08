package roud1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class ArgsTest {
    @Test
    public void given_P8080_should_P_8080() {
        Args args = new Args();
        Assertions.assertEquals(1, args.parse("-P 8080").size());
        for (Parameter parameter : args.parse("-p 8080")) {
            Assertions.assertEquals("p", parameter.getOption());
            Assertions.assertEquals("8080", parameter.getValue());
        }
    }

    @Test
    public void given_2_Parameter() {
        Args args = new Args();
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
    public void given_Option_should_Default_0() {
        Args args = new Args();
        List<Parameter> parameterList = args.parse("-P");
        Assertions.assertEquals(1, parameterList.size());
        Optional<Parameter> firstParam = parameterList.stream().findFirst();
        Assertions.assertEquals("P", firstParam.get().getOption());
        Assertions.assertEquals("0", firstParam.get().getValue());
    }
}

package roud2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgsTest {
    @Test
    public void given_key_value_should_return_value() {
        Schemas defaultValue = new Schemas("-l:true,-p:0,-d:\\");
        Args args = new Args("-l true -p 8080 -d /usr/args", defaultValue);

        assertEquals(args.getValue("-l"), "true");
        assertEquals(args.getValue("-p"), "8080");
        assertEquals(args.getValue("-d"), "/usr/args");

    }

    @Test
    public void given_key_Only_should_return_default_value() {
        Schemas defaultValue = new Schemas("-l:true,-p:0,-d:\\");
        Args args = new Args("-l -p -d", defaultValue);

        assertEquals(args.getValue("-l"), "true");
        assertEquals(args.getValue("-p"), "0");
        assertEquals(args.getValue("-d"), "\\");

    }
}

package roud2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgsTest {
    @Test
    public void given_key_value_should_return() {
        Args args = new Args("-l true -p 8080 -d /usr/args");
        assertEquals(args.getValue("-l"), "true");
        assertEquals(args.getValue("-p"), "8080");
        assertEquals(args.getValue("-d"), "/usr/args");

    }
}

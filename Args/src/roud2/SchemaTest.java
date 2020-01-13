package roud2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchemaTest {
    @Test
    public void give_key_should_return_type(){
        Schemas schemas = new Schemas("-l:true,-p:0,-d:\\");
        assertEquals(schemas.getDefaultValue("-l"),"true");
        assertEquals(schemas.getDefaultValue("-p"),"0");
        assertEquals(schemas.getDefaultValue("-d"),"\\");

    }
}

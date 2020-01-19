package roud3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgsTest {
    @Test
    public void given_full_input_should_return_parsed_parameters(){
        Args args = new Args("-l:true,-d:\\,-p:8080");
        assertEquals(3,args.getDefaultSchema().getSize());
//        assertEquals(3,args.parse("-l false -p 80 -d").getSize());
//        assertEquals("false",args.parse("-l false -p 80 -d").getValue("l"));
//        assertEquals("80",args.parse("-l false -p 80 -d").getValue("p"));
//        assertEquals("\\user\\test",args.parse("-l false -p 80 -d \\user\\test").getValue("d"));

    }

}

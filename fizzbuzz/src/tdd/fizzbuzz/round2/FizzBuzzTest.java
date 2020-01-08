package tdd.fizzbuzz.round2;

import org.junit.jupiter.api.Test;
import tdd.fizzbuzz.round2.FizzBuzz;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    @Test
    public void printNumberTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1",fizzBuzz.print(1));
        assertEquals("7",fizzBuzz.print(7));
    }

    @Test
    public void printFizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz",fizzBuzz.print(3));
        assertEquals("Fizz",fizzBuzz.print(6));
        assertEquals("Fizz",fizzBuzz.print(9));
    }

    @Test
    public void printBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz",fizzBuzz.print(5));
        assertEquals("Buzz",fizzBuzz.print(35));
    }

    @Test
    public void printFizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzz.print(15));
        assertEquals("FizzBuzz",fizzBuzz.print(30));
        assertEquals("FizzBuzz",fizzBuzz.print(90));
    }
}

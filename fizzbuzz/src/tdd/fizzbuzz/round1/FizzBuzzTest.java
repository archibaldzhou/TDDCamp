package tdd.fizzbuzz.round1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void printNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1", fizzBuzz.print(1));

    }

    @Test
    public void printFizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.print(3));
        assertEquals("Fizz", fizzBuzz.print(9));

    }

    @Test
    public void printBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Buzz", fizzBuzz.print(5));
        assertEquals("Buzz", fizzBuzz.print(100));

    }

    @Test
    public void printFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("FizzBuzz", fizzBuzz.print(15));
        assertEquals("FizzBuzz", fizzBuzz.print(90));

    }

}

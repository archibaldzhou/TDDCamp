package tdd.fizzbuzz.round3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void print_number_test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", FizzBuzz.print(1));
    }

    @Test
    public void print_fizz_test() {

        assertEquals("Fizz", FizzBuzz.print(3));
    }

    @Test
    public void print_buzz_test() {
        assertEquals("Buzz", FizzBuzz.print(5));
    }

    @Test
    public void print_fizzbuzz_test() {
        assertEquals("FizzBuzz", FizzBuzz.print(90));
    }
}

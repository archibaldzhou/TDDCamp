package tdd.fizzbuzz.round4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({"1,1", "19,19", "74,74"})
    public void given_number_should_be_number(String input, String result) {
        Assertions.assertEquals(result, fizzBuzz.print(input));
    }

    @ParameterizedTest
    @CsvSource({"3,Fizz", "9,Fizz", "99,Fizz"})
    public void given_divide_by_3_should_be_fizz(String input, String result) {
        Assertions.assertEquals(result, fizzBuzz.print(input));
    }

    @ParameterizedTest
    @CsvSource({"5,Buzz", "20,Buzz", "65,Buzz"})
    public void given_divide_by_5_should_be_Buzz(String input, String result) {
        Assertions.assertEquals(result, fizzBuzz.print(input));
    }

    @ParameterizedTest
    @CsvSource({"15,FizzBuzz", "90,FizzBuzz", "60,FizzBuzz"})
    public void given_divide_by_5_and_3_should_be_FizzBuzz(String input, String result) {
        Assertions.assertEquals(result, fizzBuzz.print(input));
    }

    @ParameterizedTest
    @CsvSource({"13,Fizz", "23,Fizz", "73,Fizz"})
    public void given_contains_3_should_be_Fizz(String input, String result) {
        Assertions.assertEquals(result, fizzBuzz.print(input));
    }

    @ParameterizedTest
    @CsvSource({"51,Buzz", "53,Buzz", "59,Buzz"})
    public void given_contains_5_should_be_Buzz(String input, String result) {
        Assertions.assertEquals(result, fizzBuzz.print(input));
    }
}

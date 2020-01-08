package tdd.fizzbuzz.round4;

public class FizzBuzz {
    public String print(String input) {
        String result = input;
        if (Integer.valueOf(input) % 3 == 0 || input.contains("3")) result = "Fizz";
        if (Integer.valueOf(input) % 5 == 0 || input.contains("5")) result = "Buzz";
        if (Integer.valueOf(input) % 15 == 0) result = "FizzBuzz";
        return result;
    }
}

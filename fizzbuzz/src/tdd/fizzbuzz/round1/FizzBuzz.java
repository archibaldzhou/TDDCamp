package tdd.fizzbuzz.round1;

public class FizzBuzz {
    public String print(int number) {
        String result = String.valueOf(number);
        if (number % 3 == 0) result = "Fizz";
        if (number % 5 == 0) result = "Buzz";
        if (number % 15 == 0) result = "FizzBuzz";
        return result;
    }
}

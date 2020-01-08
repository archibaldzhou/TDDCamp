package tdd.fizzbuzz.round3;

public class FizzBuzz {
    public static String print(int inputNumber) {
        String result = String.valueOf(inputNumber);
        if (isDivide(inputNumber,3)) result = "Fizz";
        if (isDivide(inputNumber,5)) result = "Buzz";
        if (isDivide(inputNumber, 15)) result = "FizzBuzz";
        return result;
    }

    private static boolean isDivide(int inputNumber, int i) {
        return inputNumber % i == 0;
    }

}

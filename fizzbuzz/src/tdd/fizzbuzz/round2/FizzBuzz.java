package tdd.fizzbuzz.round2;

public class FizzBuzz {
    public String print(int input) {
        String result = String.valueOf(input);
        if(input%3==0) result = "Fizz";
        if(input%5==0) result = "Buzz";
        if(input%15==0) result = "FizzBuzz";
        return result;
    }
}

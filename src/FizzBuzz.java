/**
 * Created by zeshanrasul on 15/04/2016.
 */
public class FizzBuzz {

    public static String getResult(int number){
        if (number == 0) return String.valueOf(number);
        else if (isDivisibleByFifteen(number)) return "fizzbuzz";
        else if (isDivisibleByThree(number)) return "fizz";
        else if (isDivisibleByFive(number)) return "buzz";
        return String.valueOf(number);
    }

    private static Boolean isDivisibleByThree(int number){
        return (number % 3 == 0);
    }


    private static Boolean isDivisibleByFive(int number){
        return (number % 5 == 0);
    }


    private static Boolean isDivisibleByFifteen(int number){
        return (number % 15 == 0);
    }
}


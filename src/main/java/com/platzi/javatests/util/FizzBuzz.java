package com.platzi.javatests.util;

public class FizzBuzz {
    public static String getFizzOrBuzz(int num) {
        if (num%3==0 && num%5==0)
            return "FizzBuzz";
        else if (num%3==0) return "Fizz";
        else if (num%5==0) return "Buzz";
        else return num+"";
    }
}

package com.platzi.javatests.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void num_divisible_by_3() {
        assertThat(FizzBuzz.getFizzOrBuzz(36), is("Fizz"));
    }

    @Test
    public void num_divisible_by_5() {
        assertThat(FizzBuzz.getFizzOrBuzz(25), is("Buzz"));
    }

    @Test
    public void num_divisible_by_3_and_5() {
        assertThat(FizzBuzz.getFizzOrBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void num_not_divisible_by_3_and_5() {
        assertThat(FizzBuzz.getFizzOrBuzz(29), is("29"));
    }
}
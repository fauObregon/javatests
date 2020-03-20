package com.platzi.javatests.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices(){
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.5);
        calculator.addPrice(20.5);

        assertThat(calculator.getTotal(),is(31.0));
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(50.5);
        calculator.addPrice(35.5);
        calculator.addPrice(29);
        calculator.setDiscount(25);

        assertThat(calculator.getTotal(),is(86.25));
    }
}
package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class StringCalculatorTest {

    @Test
    public void should_return_the_number_if_it_is_only_one() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1")).isEqualTo(1);
    }

    @Test
    public void should_return_the_sum_of_numbers_if_they_are_separated_by_a_comma() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1,2")).isEqualTo(3);
        Assertions.assertThat(stringCalculator.add("1,2,3,4,5,6,7,8,9")).isEqualTo(45);
    }

    @Test
    public void should_return_0_if_the_string_is_empty() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("")).isEqualTo(0);
    }

    @Test
    public void should_return_the_sum_of_numbers_if_they_are_separated_by_a_comma_or_another_lines() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1\n2,3")).isEqualTo(6);
    }

    @Test
    public void Should_optionally_support_custom_separators() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("//;\n1;2")).isEqualTo(3);
    }

    @Test
    public void Should_throw_exception_with_negative_numbers() {
        StringCalculator stringCalculator = new StringCalculator();

        try {
            stringCalculator.add("1,-2,-3");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Negatives not allowed: [-2, -3]"));
        }
    }

    @Test
    public void should_ignore_numbers_bigger_than_1000() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1001,2")).isEqualTo(2);
    }

}
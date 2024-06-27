package org.jossegonnza;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    public void should_return_0_if_string_is_empty() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("")).isEqualTo(0);
    }

    @Test
    public void should_return_the_number_of_string() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("4")).isEqualTo(4);
    }

    @Test
    public void should_return_the_sum_if_string_contains_2_numbers_separated_by_comma() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1,2")).isEqualTo(3);
    }

    @Test
    public void should_return_the_sum_if_string_contains_an_unknown_number_of_numbers() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1,2,3,4,5,6,7,8,9")).isEqualTo(45);
    }

    @Test
    public void should_return_the_sum_of_numbers_if_they_are_separated_by_comma_or_a_new_line() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1\n2,3")).isEqualTo(6);
    }

    @Test
    public void should_allow_custom_separators() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("//;\n1;2")).isEqualTo(3);
    }
}
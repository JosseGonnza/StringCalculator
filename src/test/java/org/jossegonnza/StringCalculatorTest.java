package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
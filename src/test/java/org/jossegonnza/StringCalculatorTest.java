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
    }

    @Test
    public void should_return_0_if_the_string_is_empty() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("")).isEqualTo(0);
    }
}
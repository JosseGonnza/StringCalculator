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
}
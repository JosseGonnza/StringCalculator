package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    public void should_return_the_number_if_it_is_only_one() {
        StringCalculator stringCalculator = new StringCalculator();

        Assertions.assertThat(stringCalculator.add("1")).isEqualTo(1);
    }

}
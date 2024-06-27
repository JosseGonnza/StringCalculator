package org.jossegonnza;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()){
            return 0;
        }

        int sum = 0;

        String[] numbersArray = numbers.split(",");
        for (String number : numbersArray) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}

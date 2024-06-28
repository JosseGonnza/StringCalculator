package org.jossegonnza;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()){
            return 0;
        }

        String separator = ",";
        String newNumbers = numbers;

        if (numbers.startsWith("//")) {
            int newLine = numbers.indexOf("\n");
            separator = numbers.substring(2,newLine);
            newNumbers = numbers.substring(newLine + 1);
        } else if (numbers.contains("\n")) {
            separator = ("[,\n]");
        }

        int sum = 0;
        String[] numbersArray = newNumbers.split(separator);

        List<Integer> negativeNumbs = new ArrayList<>();

        for (String number : numbersArray) {
            int testNumber = Integer.parseInt(number);

            if (testNumber < 0) {
                negativeNumbs.add(testNumber);
            }

            sum += testNumber;
        }
        if (!negativeNumbs.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbs.toString());
        }

        return sum;
    }
}

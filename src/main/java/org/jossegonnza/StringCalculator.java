package org.jossegonnza;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String separator = ",";
        String numbs = numbers;


        if (numbers.startsWith("//")) {
            int newSeparator = numbers.indexOf("\n");
            separator = numbers.substring(2, newSeparator);
            numbs = numbers.substring(newSeparator + 1);
        } else if (numbers.contains("\n")) {
            separator = "[,\n]";
        }

        String[] numbsArray = numbs.split(separator);
        int suma = 0;

        List<Integer> negativeNumbs = new ArrayList<>();

        for (String numb: numbsArray) {
            int testNumb = Integer.parseInt(numb);

            if (testNumb < 0) {
                negativeNumbs.add(testNumb);
            }
            suma += testNumb;
        }

        if (!negativeNumbs.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbs.toString());
        }

        return suma;

    }
}
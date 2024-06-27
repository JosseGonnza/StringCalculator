package org.jossegonnza;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String separator = ",";
        String numbs = numbers;


        if (numbers.startsWith("//")) {
            int newLine = numbers.indexOf("\n");
            separator = extractSeparator(numbers.substring(2, newLine));
            numbs = numbers.substring(newLine + 1);
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
            } else if (testNumb <= 1000) {
                suma += testNumb;
            }
        }

        if (!negativeNumbs.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbs.toString());
        }

        return suma;
    }

    private String extractSeparator(String separatorPart) {
        if (separatorPart.startsWith("[") && separatorPart.endsWith("]")) {
            return Pattern.quote(separatorPart.substring(1, separatorPart.length() - 1));
        }
        return Pattern.quote(separatorPart);
    }
}
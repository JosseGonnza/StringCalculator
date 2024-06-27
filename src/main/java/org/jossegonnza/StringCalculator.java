package org.jossegonnza;

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

        for (String numb : numbsArray) {
            suma += Integer.parseInt(numb);
            }

        return suma;
    }
}
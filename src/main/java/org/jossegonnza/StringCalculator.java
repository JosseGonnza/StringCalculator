package org.jossegonnza;

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
        for (String number : numbersArray) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}

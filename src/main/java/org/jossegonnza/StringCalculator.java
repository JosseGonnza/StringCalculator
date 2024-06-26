package org.jossegonnza;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String regex = "[,\n]";
        String[] numbs = numbers.split(regex);
            int suma = 0;

            for (String numb : numbs) {
            suma += Integer.parseInt(numb);
            }

            return suma;
        }
}
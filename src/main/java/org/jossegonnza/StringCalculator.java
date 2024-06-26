package org.jossegonnza;

public class StringCalculator {
    public int add(String numbers) {

            String[] numbs = numbers.split(",");
            int suma = 0;
            for (int i = 0; i < numbs.length; i++) {
                suma += Integer.parseInt(numbs[i]);
            }
            return suma;
        }
}
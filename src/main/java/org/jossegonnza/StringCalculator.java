package org.jossegonnza;

public class StringCalculator {
    public int add(String numbers) {

            String[] numbs = numbers.split(",");
            int suma = 0;

            for (String numb : numbs) {
            suma += Integer.parseInt(numb);
            }

            return suma;
        }
}
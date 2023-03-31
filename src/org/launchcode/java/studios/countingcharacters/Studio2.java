package org.launchcode.java.studios.countingcharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Studio2 {
    public static void main(String[] args) {
        HashMap<String, Integer> countedChars = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println ("Please enter a string: ");
        String example = input.nextLine();
        //String example = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = example.toCharArray();
        //System.out.printf(Arrays.toString(charactersInString));


        for (char character: charactersInString)
        {
            String y = String.valueOf(character);
            String x = y.toLowerCase();
            char z = Character.valueOf(character);

            if (Character.isLetter(z)) {
                if (!countedChars.containsKey(x)) {
                    countedChars.put(x, 1);
                } else {
                    countedChars.replace(x, countedChars.get(x) + 1);
                }
            }
        }
        System.out.println(countedChars);
    }
}
//str -> array -> collection of characters & counts - use hashmap
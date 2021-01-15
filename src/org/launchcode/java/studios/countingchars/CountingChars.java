package org.launchcode.java.studios.countingchars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        File readFromFile = new File(args[0]); //reads file name from terminal, use java CountingChars.java filename
        Scanner input = null;
        try {
            input = new Scanner(readFromFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String inputString = "";

        while(input.hasNextLine()){
            inputString = input.nextLine();
        }

//        System.out.println("Enter a string to be read:");

//        inputString = input.nextLine();

        HashMap<Character, Integer> counts = new HashMap<>();

        char[] charactersInString = inputString.toCharArray();

        for(char c : charactersInString){
            if(Character.isLetterOrDigit(c)){
                if(!counts.containsKey(c)){
                    counts.put(Character.toLowerCase(c), 1);
                }else{
                    counts.put(Character.toLowerCase(c), counts.get(c) + 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> iterator : counts.entrySet()){
            System.out.println(iterator.getKey() + ": " + iterator.getValue());
        }
    }
}

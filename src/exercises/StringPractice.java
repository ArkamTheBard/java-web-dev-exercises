package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPractice {
    public static int evenSum(ArrayList<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers)
            if (number % 2 == 0) sum += number;
        return sum;
    }

    public static void printFives(List<String> strings, int wordSize){
        for (String string : strings)
            if (string.length() == wordSize) {
                System.out.println(string);
            }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] nums = new int[]{1,1,2,3,5,8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        String[] splitSentence = sentence.split(" ");
        String[] splitSentence2 = sentence.split("\\.");
        System.out.println(Arrays.toString(splitSentence));
        System.out.println(Arrays.toString(splitSentence2));


        ArrayList<Integer> numberSequence = new ArrayList<>();
        for(int i = 0; i < 10; ++i){
            numberSequence.add(i);
        }

        System.out.println(evenSum(numberSequence));

        ArrayList<String> randomStrings = new ArrayList<>(){
            {
                add("Hello");
                add("World");
                add("LaunchCode");
                add("Eight");
                add("Five");
            }
        };

        System.out.println("Enter a word size to search for:");

        int searchLength = input.nextInt();

        List<String> splitListSentence = new ArrayList<String>();

        splitListSentence = Arrays.asList(splitSentence);

//        printFives(randomStrings, searchLength);

        printFives(splitListSentence, searchLength);


    }
}

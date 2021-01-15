package exercises;

import java.util.Scanner;

public class Alice {
    public static void main (String[] args){
        String wonderland = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but" +
                " it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to search for:");
        String searchText = input.next().toLowerCase();

        input.close();

        System.out.println(wonderland.toLowerCase().contains(searchText));
        System.out.println(wonderland.toLowerCase().indexOf(searchText));
        System.out.println(searchText.length());
        String[] modified = wonderland.toLowerCase().split(searchText);
        wonderland = String.join("", modified);
        System.out.println(wonderland);
    }
}

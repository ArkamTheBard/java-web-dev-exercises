package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles driven:");
        double miles = input.nextInt();

        System.out.println("How many gallons used:");
        double gallons = input.nextInt();

        input.close();

        double mpg = miles / gallons;

        System.out.println("Your MPG is " + mpg);
    }
}

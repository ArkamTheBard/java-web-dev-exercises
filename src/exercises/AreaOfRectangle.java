package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a width:");
        double width = input.nextDouble();

        System.out.println("Enter a length:");
        double length = input.nextDouble();

        input.close();

        double area = length * width;

        System.out.println("The area of your rectangle is: " + area);
    }
}

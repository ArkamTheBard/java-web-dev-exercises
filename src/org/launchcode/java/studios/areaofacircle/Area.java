package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double parsedRadius;
        do{
            try{
                System.out.println("Enter a radius:");
                String radius = input.nextLine();
                parsedRadius = Double.parseDouble(radius);
                break;
            }
            catch(NumberFormatException e){
                System.err.println("Error detected with input!");
            }
        }
        while(true);

        input.close();
        System.out.println("The area of a circle of radius " + parsedRadius + " is: " + Circle.getArea(parsedRadius));
    }
}

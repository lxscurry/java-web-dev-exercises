package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of gas consumed :");
        double gas = input.nextDouble();
        System.out.println("Enter number of miles driven.");
        double miles = input.nextDouble();

        double milesPerGallon = gas * miles;
        input.close();

        System.out.println("milesPerGallon is: " + milesPerGallon);
    }
}

package exercises;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double width = input.nextDouble();

        double area = length * width;
        input.close();

        System.out.println("Area of rectangle is: " + area);
    }



}

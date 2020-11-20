package com.company;
import java.util.Scanner;
// Note: Needed for math functions in part (3)


class PaintEstimator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;

        System.out.println("Enter wall height (feet):");
        wallHeight = scnr.nextDouble();
        System.out.println("Enter wall width (feet):");
        wallWidth = scnr.nextDouble();                      // FIXME (1): Prompt user to input wall's width

        // Calculate and output wall area
        wallArea = wallWidth * wallHeight;                        // FIXME (1): Calculate the wall's area
        System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement

        // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
        double gallonsPaint = wallArea / 350;
        System.out.println("Paint needed: " + gallonsPaint + " gallons");
        // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        int cansNeeded = 1 + (int)gallonsPaint;
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, this is Josh");
    }
}

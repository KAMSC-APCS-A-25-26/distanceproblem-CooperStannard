/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;


public class DistanceMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[(),\\s]+");

        // Signature
        System.out.println("Cooper Stannard\nAPCS-A\n2.8\n\n");

        //Asks for number of runs
        System.out.print("Enter number of runs:  ");
        double numruns = sc.nextDouble();
        for (int k = 0; k < numruns; k++) {
            //Reads in all numbers
            System.out.print("\nEnter two coordinates:  ");
            double xCord1 = sc.nextDouble();
            double yCord1 = sc.nextDouble();
            double xCord2 = sc.nextDouble();
            double yCord2 = sc.nextDouble();

            // Calculates the distance formula and prints the number
            double distance = Math.pow(Math.pow(xCord1 - xCord2, 2) + Math.pow(yCord1 - yCord2, 2), 1.0 / 2);
            System.out.println("The distance is " + distance);

        }
    }
}
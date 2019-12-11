import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class SciCalculator {


    public static void main(String []args) {
        Scanner scnr = new Scanner(System.in);
        double result = 0.0;
        double previousResult = 0.0;
        double operand1 = 0.00;
        double operand2 = 0.00;
        int menu = 1;
        ArrayList<Double> allResults = new ArrayList<Double>();
        int totalNumCalculations = 0;
        int numItemsCounted = 0;
        double allResultsSum = 0.00;
        double resultsAverage;

        while (menu != 0) {
            if (menu < 7 && menu > 0 ) {
                System.out.println("Current Result: " + result);
                System.out.println(" ");

                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println(" ");
            }
            System.out.print("Enter Menu Selection: ");
            menu = scnr.nextInt();

            if (menu >= 1 && menu <= 6) {
                System.out.print("Enter first operand: ");
                operand1 = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                operand2 = scnr.nextDouble();
            }

            if (menu == 1) {
                result = operand1 + operand2;
                previousResult = result;
                allResults.add(result);
                totalNumCalculations = allResults.size();
            } else if (menu == 2) {
                result = operand1 - operand2;
                previousResult = result;
                allResults.add(result);
                totalNumCalculations = allResults.size();
            } else if (menu == 3) {
                result = operand1 * operand2;
                previousResult = result;
                allResults.add(result);
                totalNumCalculations = allResults.size();
            } else if (menu == 4) {
                result = operand1 / operand2;
                previousResult = result;
                allResults.add(result);
                totalNumCalculations = allResults.size();
            } else if (menu == 5) {
                result = Math.pow(operand1, operand2);
                previousResult = result;
                allResults.add(result);
                totalNumCalculations = allResults.size();
            } else if (menu == 6) {
                result = (Math.log10(operand2) / Math.log10(operand1));
                previousResult = result;
                allResults.add(result);
                totalNumCalculations = allResults.size();
            } else if (menu == 7) {
                if (allResults.size() != 0) {
                    while (numItemsCounted - totalNumCalculations != 0) {
                        allResultsSum = allResultsSum + allResults.get(numItemsCounted);
                        numItemsCounted = numItemsCounted + 1;
                    }
                    System.out.println("Sum of calculations: " + allResultsSum);
                    System.out.println("Number of calculations: " + totalNumCalculations);
                    resultsAverage = Math.round((allResultsSum / totalNumCalculations) * 100.0) / 100.0;
                    System.out.println("Average of calculations: " + resultsAverage);
                } else {
                    System.out.println("Error: No calculations yet to average!");
                }
            } else if (menu == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
            } else {
                System.out.println("Error: Invalid selection!");
            }
        }
    }
}

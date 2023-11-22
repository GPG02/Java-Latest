package package1;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double timePeriod = scanner.nextDouble();

        scanner.close();

        double compoundInterest = calculateCompoundInterest(principal, rateOfInterest, timePeriod);
        double totalAmount = principal + compoundInterest;

        System.out.println("\nPrincipal Amount:" + principal);
        System.out.println("Annual Interest Rate:" + rateOfInterest + "%");
        System.out.println("Time Period: " + timePeriod + " years");
        System.out.println("Compound Interest:" + compoundInterest);
        System.out.println("Total Amount:" + totalAmount);
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
     
        double amount = (principal * time*rate)/100;
        return amount;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Principal:");
        Scanner scanner1 = new Scanner(System.in);
        double principal = scanner1.nextDouble();
        scanner1.close();

        System.out.printf("Annual interest rate:");
        Scanner scanner2 = new Scanner(System.in);
        double annualInterest = scanner2.nextDouble();
        double monthlyInterest = annualInterest / 12 / 100; // Convert annual interest to monthly
        scanner2.close();

        System.out.printf("Period in years:");
        Scanner scanner3 = new Scanner(System.in);
        int period = scanner3.nextInt();
        int numberOfPayments = period * 12; // Convert years to months
        scanner3.close();

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        System.out.printf("Mortgage: %.2f", mortgage);
    }
}
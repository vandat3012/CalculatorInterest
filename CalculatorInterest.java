import java.util.Scanner;

public class CalculatorInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the money (VND) ");
        double money = scanner.nextDouble();
        System.out.println("enter the interest rate (%/year)");
        double interestRate = scanner.nextDouble();
        System.out.println("enter the month");
        int month = scanner.nextInt();

        double interest = money * (interestRate / 100) * month;
        System.out.println("the interest in " + month + " month is:\n" + interest + " vnd");
    }
}

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

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * interestRate / 100 / 12;
        }
        System.out.println("the interest in " + month + " month is:\n" + totalInterest + " vnd");
    }
}

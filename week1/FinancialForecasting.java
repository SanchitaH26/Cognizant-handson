import java.util.Scanner;
public class FinancialForecasting {
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current investment value: ");
        double currentValue = sc.nextDouble();
        System.out.print("Enter annual growth rate (in decimal): ");
        double growthRate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        double futureValue = calculateFutureValue(
                currentValue,
                growthRate,
                years
        );
        System.out.println("\nFuture Value after " + years + " years: " + futureValue);
        System.out.println("\nTime Complexity Analysis:");
        System.out.println("Recursive Approach:");
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n) due to recursive call stack");
        sc.close();
    }
}
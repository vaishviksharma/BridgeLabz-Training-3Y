import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double si = calculateSimpleInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Simple Interest: " + si);
    }
}
import java.util.Scanner;

public class Quadratic {
    public static double[] roots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) return new double[]{(-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)};
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else return new double[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] r = roots(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        if (r.length == 0) System.out.println("No Real Roots");
        else for (double x : r) System.out.println("Root: " + x);
    }
}


import java.util.*;

public class NumberCheckerD {
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        long r = (long)Math.sqrt(n);
        for (long i = 3; i <= r; i += 2) if (n % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int sq = n * n, s = 0;
        while (sq > 0) { s += sq % 10; sq /= 10; }
        return s == n;
    }
    public static boolean isSpy(int n) {
        int s = 0, p = 1, t = Math.abs(n);
        if (t == 0) return false;
        while (t > 0) { int d = t % 10; s += d; p *= d; t /= 10; }
        return s == p;
    }
    public static boolean isAutomorphic(int n) {
        long sq = (long)n * (long)n;
        String a = String.valueOf(n), b = String.valueOf(sq);
        return b.endsWith(a);
    }
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || Math.abs(n) % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(n));
        System.out.println("Automorphic: " + isAutomorphic(n));
        System.out.println("Buzz: " + isBuzz(n));
    }
}

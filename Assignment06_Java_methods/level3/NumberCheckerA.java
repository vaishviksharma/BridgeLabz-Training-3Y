import java.util.*;

public class NumberCheckerA {
    public static int countDigits(long n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }
    public static int[] toDigits(long n) {
        n = Math.abs(n);
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) { d[i] = (int)(n % 10); n /= 10; }
        return d;
    }
    public static boolean isDuckNumber(long n) {
        // Standard definition: contains at least one zero (not counting leading zeros)
        int[] d = toDigits(n);
        for (int x : d) if (x == 0) return true;
        return false;
    }
    public static boolean isArmstrong(long n) {
        int[] d = toDigits(n);
        int p = d.length;
        long s = 0;
        for (int x : d) s += Math.pow(x, p);
        return s == Math.abs(n);
    }
    public static int[] largestTwo(int[] d) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > first) { second = first; first = x; }
            else if (x > second && x != first) { second = x; }
        }
        return new int[]{first, second};
    }
    public static int[] smallestTwo(int[] d) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < first) { second = first; first = x; }
            else if (x < second && x != first) { second = x; }
        }
        return new int[]{first, second};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] d = toDigits(n);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Count: " + countDigits(n));
        System.out.println("Duck: " + isDuckNumber(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        System.out.println("Largest & Second: " + Arrays.toString(largestTwo(d)));
        System.out.println("Smallest & Second: " + Arrays.toString(smallestTwo(d)));
    }
}

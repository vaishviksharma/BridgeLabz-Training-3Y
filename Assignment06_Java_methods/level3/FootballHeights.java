import java.util.*;

public class FootballHeights {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) heights[i] = (int)(Math.random() * 101) + 150;
        return heights;
    }
    public static int sum(int[] a) {
        int s = 0;
        for (int v : a) s += v;
        return s;
    }
    public static double mean(int[] a) {
        return sum(a) / 11.0;
    }
    public static int min(int[] a) {
        int m = a[0];
        for (int v : a) if (v < m) m = v;
        return m;
    }
    public static int max(int[] a) {
        int m = a[0];
        for (int v : a) if (v > m) m = v;
        return m;
    }
    public static void main(String[] args) {
        int[] h = generateHeights();
        System.out.println("Heights: " + Arrays.toString(h));
        System.out.println("Sum: " + sum(h));
        System.out.println("Mean: " + mean(h));
        System.out.println("Shortest: " + min(h));
        System.out.println("Tallest: " + max(h));
    }
}

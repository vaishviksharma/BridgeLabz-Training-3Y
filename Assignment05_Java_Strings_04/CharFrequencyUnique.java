import java.util.*;

public class CharFrequencyUnique {
    static char[] uniqueChars(String s) {
        boolean[] seen = new boolean[256];
        char[] tmp = new char[s.length()];
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen[c]) { seen[c] = true; tmp[cnt++] = c; }
        }
        return Arrays.copyOf(tmp, cnt);
    }

    static int[] freq256(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i)]++;
        return f;
    }

    static String[][] table(String s) {
        char[] uniq = uniqueChars(s);
        int[] f = freq256(s);
        String[][] out = new String[uniq.length][2];
        for (int i = 0; i < uniq.length; i++) {
            out[i][0] = String.valueOf(uniq[i]);
            out[i][1] = String.valueOf(f[uniq[i]]);
        }
        return out;
    }

    static void display(String[][] t) {
        System.out.printf("%-8s %-6s%n", "Char", "Freq");
        System.out.println("----------------");
        for (String[] r : t) System.out.printf("%-8s %-6s%n", r[0], r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        display(table(text));
    }
}


import java.util.Scanner;
public class SplitWordsWithLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(String word : words) {
            System.out.println(word + " -> length: " + word.length());
        }
    }
}
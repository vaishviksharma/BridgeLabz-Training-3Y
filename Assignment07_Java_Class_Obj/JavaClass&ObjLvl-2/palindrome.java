class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        int left= 0, right= text.length()-1;
        while (left < right){
            if (text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Palindrome p1 = new Palindrome("sus");
        p1.displayResult();
    }
}

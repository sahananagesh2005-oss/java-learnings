class PalidromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindromeReverse(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
}
public static void main(String[] args) {
    String[] testCases = {"madam","raccar","hello","noon","java"};
    System.out.println("== Palidrome Check ==");
    for(String test : testCases) {
        System.out.println(test+" is palindrome: "+isPalindrome(test));
    }
}
}


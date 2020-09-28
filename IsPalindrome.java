public class IsPalindrome {

    public static void main (String[] args) {

        String testString = "madam";
        String newString = "";

        for (int i = testString.length()-1; i >= 0; i --) {
            newString = newString + testString.charAt(i);
        }
        System.out.println(newString);

        if(testString.equalsIgnoreCase(newString)) {
            System.out.println("String is a palindrome");
        } else System.out.println("String is NOT a palindrome");

    }
}

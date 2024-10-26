import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // Reverse the string.
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse of " + str + " is: " + reverse);

        //check if a string ís a palindrome
        String reverseLower = reverse.toLowerCase();
        if(reverseLower.equals(str)) {
            System.out.println("String " + str + " is palindrome");
        }
        else {
            System.out.println("String " + str + " isn't palindrome");
        }

        //Removes extra whitespace in the string
        System.out.println("String " + str + " after removing extra whitespace: " + str.trim().replaceAll("\\s+", " "));

        //Count the number of words in a string
        int count = str.length();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count -= 1;
            }
        }
        System.out.println("Number of words in a string: " + count);

        //Checks if a string contains all the characters from 'a' to 'z'
        if(count < 26) {
            System.out.println("String does not contain all characters from 'a' to 'z'");
        }
        else {
            int result = 0;
            for(int i='a'; i<='z'; i++) {
                if(reverseLower.indexOf(i) == -1) {
                    result -= 1;
                    break;
                }
            }
            if(result == 0) {
                System.out.println("String containing all characters from 'a' to 'z'");
            }
            if(result == -1) {
                System.out.println("String doesn't containing all characters from 'a' to 'z'");
            }
        }

    }
}
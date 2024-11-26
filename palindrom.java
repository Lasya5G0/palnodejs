import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Remove spaces and convert the string to lowercase for uniform comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();
        
        // Call the method to check if the cleaned input is a palindrome
        if (isPalindrome(cleanedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        // Check characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If any characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // If all characters match, it's a palindrome
    }
}


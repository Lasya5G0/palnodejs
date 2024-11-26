public class Palindrome {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert the string to lowercase to make the check case-insensitive
        input = input.toLowerCase();
        
        // Remove spaces and punctuation (if any) using regular expression
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        
        // Call the isPalindrome method and display the result
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }
        
        return true; // If all characters match, it's a palindrome
    }
}

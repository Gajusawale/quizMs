import java.util.Scanner;

public class Solution {


    static boolean isAnagram(String a, String b) {
        // Convert both strings to lowercase (since the comparison is case-insensitive)
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if lengths of both strings are equal
        if (a.length() != b.length()) {
            return false;
        }

        // Initialize an array to store the frequency of characters
        int[] frequencyA = new int[26]; // Assuming only lowercase English alphabets
        int[] frequencyB = new int[26];

        // Calculate frequencies of characters in string 'a'
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isLetter(c)) {
                frequencyA[c - 'a']++;
            }
        }

        // Calculate frequencies of characters in string 'b'
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (Character.isLetter(c)) {
                frequencyB[c - 'a']++;
            }
        }

        // Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (frequencyA[i] != frequencyB[i]) {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

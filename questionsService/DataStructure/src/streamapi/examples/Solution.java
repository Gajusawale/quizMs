package streamapi.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Check if the lengths of the strings are equal
        if (a.length() != b.length()) {
            return false;
        }

        // Get the frequency map for string 'a'
        Map<Character, Integer> freqMapA = charFreqCheck(a);
        // Get the frequency map for string 'b'
        Map<Character, Integer> freqMapB = charFreqCheck(b);

        // Check if the frequency maps are equal
        return freqMapA.equals(freqMapB);
    }

    static Map<Character, Integer> charFreqCheck(String input) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (freqMap.containsKey(a)) {
                int num = freqMap.get(a);
                freqMap.put(a, num + 1);
            } else {
                freqMap.put(a, 1);
            }
        }

        return freqMap;
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

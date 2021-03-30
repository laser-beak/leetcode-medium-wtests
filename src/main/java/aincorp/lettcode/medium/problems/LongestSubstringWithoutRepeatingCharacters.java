package aincorp.lettcode.medium.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int result;

        Set<String> substringSet = new HashSet<>();

        StringBuilder concatenation = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            concatenation.append(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                if (!concatenation.toString().contains(String.valueOf(s.charAt(j)))) {
                    concatenation.append(s.charAt(j));
                } else {
                    break;
                }
            }
            substringSet.add(concatenation.toString());
            concatenation = new StringBuilder();
        }

        int max = 0;
        for (String str : substringSet) {
            if (max <= str.length()) {
                max = str.length();
            }
        }
        result = max;

        return result;
    }
}

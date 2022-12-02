package aincorp.lettcode.medium.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }

        if (s.equals("")) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            }
            return s.substring(0, 1);
        }

        boolean f = true;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(0)) {
                f = false;
            }
        }

        if (f) {
            return s;
        }

        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {

                    int pS = i;
                    int pE = j;

                    boolean flag = true;

                    while (pS < pE) {
                        if (s.charAt(pS) != s.charAt(pE)) {
                            flag = false;
                        }
                        pS++;
                        pE--;
                    }

                    if (flag == true) {
                        stringSet.add(s.substring(i, j + 1));
                    }
                }
            }
        }

        String result = "";

        int max = 0;

        for (String str : stringSet) {
            if (str.length() > max) {
                max = str.length();
                result = str;
            }
        }

        if (stringSet.isEmpty()) {
            return s.substring(0, 1);
        }

        return result;
    }
}

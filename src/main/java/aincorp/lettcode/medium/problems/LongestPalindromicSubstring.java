package aincorp.lettcode.medium.problems;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String result = "";

        if (s.equals(null)) {
            return null;
        }

        if (s.equals("")) {
            return "";
        }

        List<String> stringList = new ArrayList<>();

        int pointer1 = 0;
        int pointer2 = s.length() - 1;

        String ss = "";

        while (pointer1 < pointer2) {
            if (s.charAt(pointer1) == s.charAt(pointer2)) {
                System.out.println("p1 = " + s.charAt(pointer1));
                System.out.println("p2 =" + s.charAt(pointer2));
            } else {
                pointer1++;
            }
            pointer2--;
        }

        int index = 0;
        int max = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > max) {
                max = stringList.get(i).length();
                index = i;
            }
        }

        return result;
    }
}

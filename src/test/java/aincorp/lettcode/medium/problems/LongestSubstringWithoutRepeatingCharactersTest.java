package aincorp.lettcode.medium.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void when_s_is_empty_result_zero() {
        assertEquals(0, longest.lengthOfLongestSubstring(""));
    }

    @Test
    public void when_s_is_Empty_result_one() {
        assertEquals(1, longest.lengthOfLongestSubstring(" "));
    }

    @Test
    public void when_s_bbbb_result_one() {
        assertEquals(1, longest.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void when_s_abcabcbb_result_three() {
        assertEquals(3, longest.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void when_s_pwwkew_result_three() {
        assertEquals(3, longest.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void when_s_au_result_two() {
        assertEquals(2, longest.lengthOfLongestSubstring("au"));
    }

}
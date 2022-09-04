package aincorp.lettcode.medium.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsTest {
    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void test() {
        //assertEquals(1, uniquePaths.uniquePaths(0, 0));
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
        assertEquals(193536720, uniquePaths.uniquePaths(23, 12));
    }

}
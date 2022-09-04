package aincorp.lettcode.medium.problems;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[] table = new int[m];
        for (int i = 0; i < m; i++) {
            table[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                table[j] = table[j] + table[j - 1];
            }
        }
        return table[m - 1];
    }
}

import java.util.*;

// User function Template for Java

class Solution {
    TreeSet<String> ans;
    Set<Integer> visited;

    public List<String> allLCS(String s1, String s2) {
        ans = new TreeSet<>();
        visited = new HashSet<>();

        // Code here
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }

        int L = dp[n][m];

        printLCS(1, 1, new StringBuilder(), s1, s2, dp, L);

        return new ArrayList<>(ans);
    }


    // helper method to print all the lcs
    public void printLCS(int i, int j, StringBuilder sb, String s1, String s2, int[][] dp, int L) {
        int n = s1.length();
        int m = s2.length();

        if (i == n + 1 || j == m + 1) {
            if (dp[i - 1][j - 1] == L)
                ans.add(sb.toString());
            return;
        }
        
        int key = (i * 11 + j * 102 + sb.length() * 1003) + i + j + sb.length();
        if (visited.contains(key))
            return;

        // if chars is same
        if (s1.charAt(i - 1) == s2.charAt(j - 1) && dp[i][j] == dp[i - 1][j - 1] + 1) {
            sb.append(s1.charAt(i - 1));
            printLCS(i + 1, j + 1, sb, s1, s2, dp, L);

            // backtracking
            sb.deleteCharAt(sb.length() - 1);
        }
        // if chars isn't same
        else {
            if (dp[i][j] == dp[i - 1][j]) {
                printLCS(i + 1, j, sb, s1, s2, dp, L);
            }
            if (dp[i][j] == dp[i][j - 1]) {
                printLCS(i, j + 1, sb, s1, s2, dp, L);
            }
        }
        
        visited.add(key);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution obj = new Solution();

        int t = in.nextInt();
        while (t-- > 0) {
            String s1 = in.next();
            String s2 = in.next();

            System.out.println(obj.allLCS(s1, s2));
        }
    }
}
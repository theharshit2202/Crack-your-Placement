public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        for (int point : cardPoints) totalSum += point;

        int windowSum = 0;
        for (int i = 0; i < n - k; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;
        for (int i = n - k; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - (n - k)];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(solution.maxScore(cardPoints, k)); // Expected output: 12
    }
}

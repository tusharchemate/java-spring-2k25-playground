class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int max = 0, i = 0;

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int j = 0; j < nums.size(); j++) {
            count.put(nums.get(j), count.getOrDefault(nums.get(j), 0) + 1);
            max = Math.max(max, count.get(nums.get(j)));

            if (j - i + 1 - max > k) {
                count.put(nums.get(i), count.get(i) - 1);
                i++;
            }
        }

        return max;
    }
}

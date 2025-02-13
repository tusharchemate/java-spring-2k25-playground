class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int product = 1;
        for (int num : nums) {
            product *= num;
            max = Math.max(max, product);
            if (product == 0) product = 1;
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            max = Math.max(max, product);
            if (product == 0) product = 1;
        }
        return max;
    }
}

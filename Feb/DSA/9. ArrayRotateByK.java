class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1); // entire reverse array
        reverse(nums, 0, k-1); //reverse still k
        reverse(nums, k, nums.length - 1); // from k to array length

    }

    public void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

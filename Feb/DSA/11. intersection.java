class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> resultSet = new HashSet<>();
        HashSet<Integer> nums = new HashSet<>();

        for (int num : nums1) {
            nums.add(num);
        }

        for (int num : nums2) {
            if (nums.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert HashSet to an array
        int[] res = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            res[i] = num;
            i++;
        }

        return res;
    }
}

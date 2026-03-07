class Solution {
   public boolean check(int[] nums) {

        int n = nums.length;
        int pos = 1;

        while (pos < n && nums[pos] >= nums[pos - 1]) {
            pos++;
        }

        if (pos == n) {
            return true;
        }

        if (nums[pos] > nums[0]) {
            return false;
        }

        pos++;

        while (pos < n && nums[pos] >= nums[pos - 1] && nums[pos] <= nums[0]) {
            pos++;
        }

        return pos == n;
    }
}
public class Solution {
public int missingNumber(int[] nums) {
int n = nums.length;
int total = n * (n + 1) / 2;
int sum = 0;
for (int num : nums) sum += num;
return total - sum;
    }
public static void main(String[] args) {
Solution sol = new Solution();
int[] nums = {3, 0, 1};
System.out.println("Missing number: " + sol.missingNumber(nums));
    }
}

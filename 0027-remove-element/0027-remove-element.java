public class Solution {
public int removeElement(int[] nums, int val) {
int index = 0;
for(int i = 0; i < nums.length; i++) {
if(nums[i] != val) {
nums[index++] = nums[i];
}
}
return index;
    }
public static void main(String[] args) {
Solution sol = new Solution();
int[] nums = {3, 2, 2, 3};
int val = 3;
int length = sol.removeElement(nums, val);
System.out.print("Array after removing " + val + ": ");
for(int i = 0; i < length; i++) {
System.out.print(nums[i] + " ");
        }
    }
}

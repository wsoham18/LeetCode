import java.util.Arrays;
public class Solution {
public int[] plusOne(int[] digits) {
for(int i = digits.length - 1; i >= 0; i--) {
if(digits[i] < 9) {
digits[i]++;
return digits;
}
digits[i] = 0;
 }
 int[] newDigits = new int[digits.length + 1];
newDigits[0] = 1;
return newDigits;
    }
public static void main(String[] args) {
Solution sol = new Solution();
int[] digits = {9, 9, 9};
System.out.println("Result: " + Arrays.toString(sol.plusOne(digits)));
    }
}

public class Solution {
 public boolean isPowerOfTwo(int n) {
return n > 0 && (n & (n - 1)) == 0;
    }
public static void main(String[] args) {
Solution sol = new Solution();
int testValue = 16;
boolean result = sol.isPowerOfTwo(testValue);
System.out.println("Is " + testValue + " a power of two? " + result);
    }
}

public class Solution {
public int mySqrt(int x) {
if (x < 2) return x;
int left = 1, right = x / 2;
int result = 0;
while (left <= right) {
int mid = left + (right - left) / 2;
long square = (long) mid * mid;
if (square == x) return mid;
else if (square < x) {
result = mid; 
left = mid + 1;
} else {
 right = mid - 1;
 }
  }
 return result;
    }
public static void main(String[] args) {
Solution sol = new Solution();
int x = 10;
System.out.println("Square root of " + x + " is: " + sol.mySqrt(x));
    }
}

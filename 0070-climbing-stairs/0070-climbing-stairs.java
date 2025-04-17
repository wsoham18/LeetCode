public class Solution {
public int climbStairs(int n) {
if (n <= 2) return n;
int first = 1, second = 2;
for(int i = 3; i <= n; i++) {
int third = first + second;
first = second;
second = third;
 }
return second;
    }
public static void main(String[] args) {
Solution sol = new Solution();
System.out.println("Ways to climb 5 stairs: " + sol.climbStairs(5));
    }
}

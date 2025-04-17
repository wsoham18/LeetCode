public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "Hello World";
        System.out.println("Length of last word: " + sol.lengthOfLastWord(input));
    }
}

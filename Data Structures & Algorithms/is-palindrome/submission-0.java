class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase().replaceAll(
          "[^a-z0-9]", "");
        StringBuilder reverse =  new StringBuilder(newS);
        reverse.reverse();
        return newS.equals(reverse.toString());
    }
}

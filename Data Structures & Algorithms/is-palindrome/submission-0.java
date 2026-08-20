class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) sb.append(Character.toLowerCase(ch));
        }
        String s1=sb.toString();
        String s2= new StringBuilder(s1).reverse().toString();
        if(s1.equals(s2)) return true;
        else return false;

        
    }
}

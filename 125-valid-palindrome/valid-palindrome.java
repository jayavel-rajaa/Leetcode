class Solution {
    public boolean isPalindrome(String s) {
        String ss=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev="";
        for(int i=ss.length()-1;i>=0;i--){
            rev+=ss.charAt(i);
        }
        if(rev.equals(ss)){
            return true;
        }
        else 
            return false;
    }
}
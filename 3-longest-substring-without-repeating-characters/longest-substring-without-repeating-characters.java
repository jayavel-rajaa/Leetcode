class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(set.contains(ch))
                    break;
                set.add(ch);
                max = Math.max(max,j-i+1);    
            }
        }
        return max;
    }
}
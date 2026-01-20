class Solution {
    public String convertToTitle(int co) {
        int n=co;
        String res="";
        while(n>0){
            n--;
            int d = n%26;
            res = (char)('A'+d)+res;
            n=n/26;
        }
        return res;
    }
}
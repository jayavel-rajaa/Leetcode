class Solution {
    public int subtractProductAndSum(int n) {
        int m=1,s=0;
        while(n!=0){
            int d=n%10;
            m=m*d;
            s=s+d;
            n=n/10;
        }
        return m-s;
    }
}
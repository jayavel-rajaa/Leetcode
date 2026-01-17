class Solution {
    public boolean checkPerfectNumber(int num) {
        int t=num;
        int s=0;
        for(int i=1;i<t;i++){
            if(t%i==0){
                s=s+i;
            }
        }
        if(s==num)
            return true;
        else
            return false;
    }
}
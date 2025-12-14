class Solution {
    public int addDigits(int num) {
        int s=0,s1=0,s2=0;      
        while(num!=0){
            int d=num%10;
            s=s+d;
            num=num/10;
     }
     while(s!=0){
        int d=s%10;
            s1=s1+d;
            s=s/10;
     }
     while(s1!=0){
        int d=s1%10;
            s2=s2+d;
            s1=s1/10;
     }
     return s2;
    }
}
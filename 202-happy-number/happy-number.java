class Solution {
    public boolean isHappy(int n) {
        int t=n;
        int s=0;
        while(n!=0){
            int d=n%10;
            s=s+(d*d);
            n=n/10;
        }
        if(s==1)
            return true;
        else{
            int ss=0;
            while(s!=0){
            int d=s%10;
            ss=ss+(d*d);
            s=s/10;
            }
            if(ss==1)
                return true;
            else{
                int sss=0;
                while(ss!=0){
                int dd=ss%10;
                sss=sss+(dd*dd);
                ss=ss/10;
            }
            if(sss==1)
                return true;
            else{
                int s4=0;
                while(sss!=0){
                int dd=sss%10;
                s4=s4+(dd*dd);
                sss=sss/10;
            }
            if(s4==1)
                return true;
            else{
                 int s5=0;
                while(s4!=0){
                int dd=s4%10;
                s5=s5+(dd*dd);
                s4=s4/10;
            }
            if(s5==1)
                return true;
            else{
                 int s6=0;
                while(s5!=0){
                int dd=s5%10;
                s6=s6+(dd*dd);
                s5=s5/10;
            }
            if(s6==1)
                return true;
            else{
                 int s7=0;
                while(s6!=0){
                int dd=s6%10;
                s7=s7+(dd*dd);
                s6=s6/10;
            }
            if(s7==1)
                return true;
            else
                return false;
              }
            }   
          }
        }
    }
}
    }
}
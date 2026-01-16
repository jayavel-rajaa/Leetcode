class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        if(n==1)
            return 10;
        if(n==2)
            return 91;
        if(n==3)
            return 91+(9*9*8);
        if(n==4)
            return 91+(9*9*8)+(9*9*8*7);
        if(n==5)
            return 91+(9*9*8)+(9*9*8*7)+(9*9*8*7*6);  
        if(n==6)
            return 91+(9*9*8)+(9*9*8*7)+(9*9*8*7*6)+(9*9*8*7*6*5);      
        if(n==7)
            return 91+(9*9*8)+(9*9*8*7)+(9*9*8*7*6)+(9*9*8*7*6*5)+(9*9*8*7*6*5*4);
        if(n==8)
            return 91+(9*9*8)+(9*9*8*7)+(9*9*8*7*6)+(9*9*8*7*6*5)+(9*9*8*7*6*5*4)+(9*9*8*7*6*5*4*3);    
        else    
            return 0;  
    }   
}
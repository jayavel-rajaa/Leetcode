class Solution {
    public int numberOfSteps(int num) {
        int count=0,count1=0;
        int x=num;
        while(x!=0){
            if(x%2==0){
                count++;
                x=x/2;
                }
            else{
                x=x-1;
                count1++;
            }
        
        }
        return count+count1;
    }
}
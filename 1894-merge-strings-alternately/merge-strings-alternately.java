class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=0;
        int w1 = word1.length();
        int w2 = word2.length();
        String r = "";
        for(int i=0;i<w1;i++){
            for(int j=0;j<w2;j++){
                char ch1 = word1.charAt(i);
                char ch2 = word2.charAt(j);
                if(i==j)
                    r=r+ch1+ch2;
                  
            }   
        }
        int jj,kk;
        if(w1>w2){
            jj = w1-w2;
            for(int i=w1-jj;i<w1;i++){
            char ch11 = word1.charAt(i);
            r=r+ch11;
        }
        }
        else if(w2>w1){
            kk = w2-w1;
            for(int j=w2-kk;j<w2;j++){
            char ch22 = word2.charAt(j);
            r=r+ch22;
        }
        }
    
        
    return r;
    }
}
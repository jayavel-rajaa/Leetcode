class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length*width*height;
        if((length>=10000 || width>=10000 || height>=10000 || volume>=1_000_000_000L) && mass>=100)
            return "Both";

        if(length>=10000 || width>=10000 || height>=10000 || volume>=1_000_000_000L)
            return "Bulky";

        if(mass>=100)
            return "Heavy";
        return "Neither";
    }
}
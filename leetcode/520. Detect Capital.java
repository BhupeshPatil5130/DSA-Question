class Solution {
    public boolean detectCapitalUse(String word) {
         boolean upperFlag=false,lowerFlag=false;
        for(int i=0;i<word.length();++i){
            if(Character.isUpperCase(word.charAt(i)))
            {
                if(lowerFlag== true)
                    return false;
                if(i==0)
                    continue;
                else
                    upperFlag = true;
            }
            else if(Character.isLowerCase(word.charAt(i)))
            {
                if(upperFlag==true)
                    return false;
                lowerFlag = true;
            }
        }
        return true;  
    }
}
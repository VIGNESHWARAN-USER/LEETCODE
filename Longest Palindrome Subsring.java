class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int val=0,i=0;
        int temp = s.length()-val;
        while(i<s.length()){
            String pali = s.substring(i,temp);
            int n = pali.length();
            for(int x=0;x<pali.length()/2;x++){
                if(pali.charAt(x)!=pali.charAt(pali.length()-1-x)){
                    pali="";
                    break;
                }
            }
            if(pali.length()!=0){
                return pali;
            }
            if(temp<s.length()){
                i++;
                temp++;
            }
            else{
                i=0;
                val++;
                temp = s.length()-val;
            }
        }
        return "";
    }}

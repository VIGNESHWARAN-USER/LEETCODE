class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        int flag = 1;
        while(temp != ""){
            flag = 1;
        for(String x:strs){
            System.out.println(temp+" "+x);
            System.out.println(x.startsWith(temp));
            if(! x.startsWith(temp)){
                flag =0;
                break;
            }
        }
        System.out.println("Flag:"+flag);
        if(flag == 1){
            return temp;
        }
        else{
        temp = temp.substring(0,temp.length()-1);
        }
        }
        return temp;
    }
}

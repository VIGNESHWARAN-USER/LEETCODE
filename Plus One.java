class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0;i--){
            digits[i] = digits[i] + 1;
            System.out.println(digits[i]);
            if(digits[i]<10){
                break;
            }
            else if(i == 0){
                int[] arr = new int[digits.length+1];
                arr[0] = 1;
                arr[1] = digits[0]%10;
                return arr;
            }
            else{
                digits[i] = 0;
            }
        }
        for(int x: digits){
            System.out.println(x);
        }
        return digits;
    }
}

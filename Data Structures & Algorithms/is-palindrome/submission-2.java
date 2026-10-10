class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr = s.toCharArray();
        char[] pre = new char[charArr.length];
        int length =0;
        for(char ch:charArr){
            if(Character.isLetterOrDigit(ch)){
                pre[length]=Character.toLowerCase(ch);
                length++;
            }
        }
        for(int i=0;i<length/2;i++){
            if(pre[i]!=pre[length-i-1]){
                return false;
            }
        }
        return true;
    }
}

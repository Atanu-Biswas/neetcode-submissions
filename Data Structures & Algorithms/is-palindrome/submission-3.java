class Solution {
    public boolean isPalindrome(String s) {
        char[] arr= s.toCharArray();
        char[] pre= new char[s.length()];
        int length=0;
        
        for(char ch: arr){
            if(Character.isLetterOrDigit(ch)){
                pre[length]=Character.toLowerCase(ch);
                length++;
            }
        }

        for(int i=0;i<length/2;i++){
            if(pre[i]!=pre[length-1-i]){
                return false;
            }
        }
        return true;
    }
}

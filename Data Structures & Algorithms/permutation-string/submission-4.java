class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] s1Arr=new int[26];
        int[] s2Arr=new int[26];
        int match=0;

        for(int i=0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;
            s2Arr[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(s1Arr[i]==s2Arr[i]){
                match++;
            }
        }

        int left=0;

        for(int i=s1.length();i<s2.length();i++){
            
            if(match==26) return true;
            
            int index=s2.charAt(left)-'a';

            s2Arr[index]--;

            if(s1Arr[index]==s2Arr[index]){
                    match++;
                }else if(s1Arr[index]-1==s2Arr[index]){
                    match--;
                }
            
            index=s2.charAt(i)-'a';

            s2Arr[index]++;

            if(s1Arr[index]==s2Arr[index]){
                    match++;
                }else if(s1Arr[index]+1==s2Arr[index]){
                    match--;
                }
            left++;
            
        }

        
        return match==26;

    }
}

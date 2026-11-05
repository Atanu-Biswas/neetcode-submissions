class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arrS1 = new char[26];
        char[] arrS2 = new char[26];
        int matches=0;

        if(s1.length()>s2.length()) return false;

        for(int i=0;i<s1.length();i++){
            arrS1[s1.charAt(i)-'a']++;
            arrS2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arrS1[i]==arrS2[i]) matches++;
        }

        for(int r=s1.length();r<s2.length();r++){
            if(matches==26) return true;
            
            int index=s2.charAt(r)-'a';

            arrS2[index]++;

            if(arrS1[index]==arrS2[index]){
                matches++;
            }else if(arrS1[index]+1==arrS2[index]){
                matches--;
            }

            index=s2.charAt(r-s1.length())-'a';

            arrS2[index]--;

            if(arrS1[index]==arrS2[index]){
                matches++;
            }else if(arrS1[index]-1==arrS2[index]){
                matches--;
            }

        }

        return matches==26;
    }
}

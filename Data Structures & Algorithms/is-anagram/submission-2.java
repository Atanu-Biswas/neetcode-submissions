class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> sMap= new HashMap<>();
        // HashMap<Character,Integer> tMap= new HashMap<>();
        // for(Character ch: s.toCharArray()){
        //     sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        // }
        // for(Character ch: t.toCharArray()){
        //     tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        // }
        // if(sMap.equals(tMap)){
        //     return true;
        // }
        // return false;

       if(s.length()!=t.length()){
        return false;
       }
       char[] sArr= s.toCharArray();
       Arrays.sort(sArr);
       char[] tArr= t.toCharArray();
       Arrays.sort(tArr);
       for(int i=0;i<s.length();i++){
        if(tArr[i]!=sArr[i]) return false;
       }
       return true;
    }
}

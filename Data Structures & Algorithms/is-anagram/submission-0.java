class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        for(char i: s.toCharArray()){
            hashMap1.put(i,(hashMap1.getOrDefault(i,0)+1));
        }
        for(char i: t.toCharArray()){
            hashMap2.put(i,(hashMap2.getOrDefault(i,0)+1));
        }
        return hashMap1.equals(hashMap2);
    }
}

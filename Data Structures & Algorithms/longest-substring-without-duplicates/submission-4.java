class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) return 0;
        HashMap<Character,Integer> map = new HashMap<>();

        int right=0;
        int left=0;

        int res=0;
        
        for(;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                if(map.get(s.charAt(right)) >= left ){
                    res=Math.max(res,right-left);
                    left=map.get(s.charAt(right))+1;
                }
            }
            map.put(s.charAt(right),right);
        }

        return res=Math.max(res,right-left);
    }
}

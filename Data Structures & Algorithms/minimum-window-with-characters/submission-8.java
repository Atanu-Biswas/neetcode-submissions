class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();
        int l=0;
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> window= new HashMap<>();
        
        int have=0;
        int need=map.size();
        int ans[] = {-1,-1};
        int ansLength=Integer.MAX_VALUE;

        for(int r=0;r<s.length();r++){
            char ch= s.charAt(r);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(map.containsKey(ch)){
                if(map.get(ch).equals(window.get(ch))){
                    have++;
                }
            }
            while(need==have){
                if(ansLength>r-l+1){
                ans[0]=l;
                ans[1]=r;
                ansLength=r-l+1;
                }
                
                    char lc= s.charAt(l);
                    window.put(lc,window.get(lc)-1);
                    if(map.containsKey(lc) && map.get(lc) > window.get(lc)){
                        have--;
                    }
                    l++;
            }
            
        }
        return ansLength==Integer.MAX_VALUE? "":s.substring(ans[0],ans[1]+1);
    }
}

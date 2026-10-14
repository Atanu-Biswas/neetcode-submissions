class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length()<t.length() || t.isEmpty()){
            return "";
        }
        
        int len=t.length();
        String res="";
        int resLen=s.length()+1;

        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        
        int left=0;
        int right=0;

        int have=0;
        //int need=t;

        for(int i=0;i<len;i++){
            char index=t.charAt(i);
            tMap.put(index,tMap.getOrDefault(index,0)+1);
            window.put(index,0);
        }

        int need= tMap.size();

        while(right<s.length()){

            char rightIndex=s.charAt(right);

            if(window.containsKey(rightIndex)){
                window.put(rightIndex,window.get(rightIndex)+1);
                if(window.get(rightIndex).equals(tMap.get(rightIndex))) have++;
            }

            while(need==have){

                if(resLen>right-left+1){
                    resLen=right-left+1;
                    res=s.substring(left,right+1);
                } 
                
                char leftIndex=s.charAt(left);

                if(window.containsKey(leftIndex)){
                    window.put(leftIndex,window.get(leftIndex)-1);
                    if(window.get(leftIndex)<tMap.get(leftIndex)) have--;
                }

                left++;
            }
            right++;
        }

        return res;

    }
}

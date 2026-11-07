class TimeMap {
    
    HashMap<String,List<Pair>> map;

    public TimeMap() {
        
        map = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        Pair p=new Pair();
        p.value=value;
        p.timeStamp=timestamp;
        if(map.containsKey(key)){
            map.get(key).add(p);
        }else{
            List<Pair> ls= new ArrayList<>();
            ls.add(p);
            map.put(key,ls);
        }
    }
    
    public String get(String key, int timestamp) {
        List<Pair> ls= map.getOrDefault(key,null);
        String res= "";
        if(ls==null) return res;
        int left=0;
        int right=ls.size()-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(ls.get(mid).timeStamp==timestamp){
                return ls.get(mid).value;
            }else if(ls.get(mid).timeStamp<timestamp){ //1,2,3,4,5,6,7
                res= ls.get(mid).value;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return res;
    }
    class Pair{
        int timeStamp;
        String value;
    }
}

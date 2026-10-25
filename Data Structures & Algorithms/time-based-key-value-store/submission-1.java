class TimeMap {

    HashMap<String,List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair p = new Pair();
        p.timestamp=timestamp;
        p.value=value;

        if(map.containsKey(key)){
            map.get(key).add(p);
        }else{
            List<Pair> ls= new ArrayList<>();
            ls.add(p);
            map.put(key,ls);
        }
    }
    
    public String get(String key, int timestamp) {
        List<Pair> p =map.get(key);
        if (p == null || p.isEmpty()) {
            return "";
        }
        int l=0;
        int r=p.size()-1;
        String res="";
        while(l<=r){
            int mid=(l+r)/2;

            if(p.get(mid).timestamp == timestamp){
                return p.get(mid).value;
            }
            
            if(p.get(mid).timestamp<timestamp){
                res=p.get(mid).value;
                l=mid+1;
            }
            if(p.get(mid).timestamp>timestamp){
                r=mid-1;
            }
        }

        return res;
    }
}

public class Pair{
    int timestamp;
    String value; 
}

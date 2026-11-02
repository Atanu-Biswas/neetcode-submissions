class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i=0;i<=nums.length;i++){
            list.add(new ArrayList<>());
        }

        for(Integer i:map.keySet()){
            list.get(map.get(i)).add(i);
        }

        int[] res= new int[k];
        int index=0;

        for(int i=nums.length;i>=0;i--){
            for(int j:list.get(i)){
                res[index]=j;
                index++;
                if(index==k){return res;}
            }
        } 

        return null;
    }
}

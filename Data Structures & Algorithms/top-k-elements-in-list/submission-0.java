class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int i=0;i<=nums.length;i++){
            arr.add(new ArrayList<>());
        }

        for(Integer key:map.keySet()){
            arr.get(map.get(key)).add(key);
        }
        int[] result=new int[k];
        int index=0;
        for(int i=nums.length;i>=0;i--){
            for(int j:arr.get(i)){
                result[index]=j;
                index++;

                if(index==k){return result;}
            }
        }
        return null;
    }
}

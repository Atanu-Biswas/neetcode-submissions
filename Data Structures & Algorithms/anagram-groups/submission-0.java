class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for(String s: strs){
            int[] arr = new int[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
            //String key = arr.toString();
            String key = Arrays.toString(arr);
            hashMap.putIfAbsent(key,new ArrayList<>());
            hashMap.get(key).add(s);
            }
            return new ArrayList<>(hashMap.values());
        }
        
    }

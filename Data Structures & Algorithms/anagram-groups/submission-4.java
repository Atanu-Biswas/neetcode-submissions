class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<String,List<String>> map=new HashMap<>();
        // for(int i=0;i<strs.length;i++){
        //     char[] arr=strs[i].toCharArray();
        //     Arrays.sort(arr);
        //     String temp = new String(arr);
        //     if(map.containsKey(temp)){
        //         map.get(temp).add(strs[i]);
        //     }else{
        //     map.put(temp,new ArrayList<>(Arrays.asList(strs[i])));
        //     }
        // }
        // return new ArrayList<>(map.values());
        HashMap<List<Integer>,List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for(String s: strs){
            
            Arrays.fill(count,0);
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }

            List<Integer> key = new ArrayList<>();
            for(int c: count){
                key.add(c);
            }

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
        }
    }

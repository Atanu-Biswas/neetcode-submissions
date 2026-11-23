class WordDictionary {

    TrieNode root;

    class TrieNode{
        TrieNode[] arr;
        boolean isEnd;
        TrieNode(){
            arr= new TrieNode[26];
            isEnd=false; 
        }
    }

    public WordDictionary() {
        root= new TrieNode();    
    }

    public void addWord(String word) {
        TrieNode cur = root;
        for(int i=0;i<word.length();i++){
            int ch= word.charAt(i)-'a';
            if(cur.arr[ch]==null){
                TrieNode node= new TrieNode();
                cur.arr[ch]=node;
            }
            cur=cur.arr[ch];
        }
        cur.isEnd=true;
    }

    public boolean search(String word) {
        return dfs(root,word,0);
    }

    private boolean dfs(TrieNode node, String word, int idx){
            TrieNode cur=node;
            for(int i=idx;i<word.length();i++){
                char ch= word.charAt(i);
                if(ch!='.'){
                    if(cur.arr[ch-'a']==null) return false;
                    cur=cur.arr[ch-'a'];
                }else{
                    for(TrieNode n: cur.arr){
                        if(n!=null && dfs(n,word,i+1)){
                            return true;
                        }
                    }
                    return false;
                }
            }
            return cur.isEnd;
        }

}

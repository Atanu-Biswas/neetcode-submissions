class PrefixTree {

    TrieNode root;

    class TrieNode{
        TrieNode[] arr;
        boolean isEnd;
        TrieNode(){
            this.arr=new TrieNode[26];
            this.isEnd=false;
        }
    }

    public PrefixTree() {
        root= new TrieNode();
    }

    public void insert(String word) {
            TrieNode cur=root;
            for(int i=0;i<word.length();i++){
                int ch= word.charAt(i) - 'a';
                if(cur.arr[ch]==null){
                    TrieNode node = new TrieNode();
                    cur.arr[ch]= node;
                }
                cur=cur.arr[ch];
            }
            cur.isEnd=true;
    }

    public boolean search(String word) {
        TrieNode cur= root;
        for(int i=0;i<word.length();i++){
            int ch= word.charAt(i)-'a';
            if(cur.arr[ch]==null) return false;
            cur=cur.arr[ch];
        }
        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur= root;
        for(int i=0;i<prefix.length();i++){
            int ch= prefix.charAt(i)-'a';
            if(cur.arr[ch]==null) return false;
            cur=cur.arr[ch];
        }
        return true;
    }
}

class LRUCache {

    int cap;
    HashMap<Integer,Node> map;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.cap=capacity;
        left = new Node(0,0);
        right = new Node(0,0);
        left.next=right;
        right.prev=left;
    }

    void insert(int key){
        Node node = map.get(key);
        Node prev = right.prev;
        prev.next=node;
        right.prev=node;
        node.next=right;
        node.prev=prev;
    }

    void remove(int key){
        Node node= map.get(key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            remove(key);
            insert(key);
            return(map.get(key).val);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(key);
        }
        map.put(key,new Node(key,value));
        insert(key);

        if(map.size()>cap){
            int lru = left.next.key;
            remove(lru);
            map.remove(lru);

        }
    }

    class Node{
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
}

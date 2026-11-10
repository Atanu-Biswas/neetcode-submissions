class MinStack {

    Node head;
    int size;

    public MinStack() {
        head=new Node(0);
        head.min=Integer.MAX_VALUE;
        size=0;
    }
    
    public void push(int val) {
        Node nd= new Node(val);
        nd.next=head;
        if(head.min>val){
            nd.min=val;
        }else{
            nd.min=head.min;
        }
        size++;
        head=nd;
    }
    
    public void pop() {
        if(size>0){
            head=head.next;
            size--;
        }
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return size>0?head.min:null;
    }

    class Node{
        int val;
        int min;
        Node next;
        
        Node(int val){
            this.val=val;
        }
    }

}

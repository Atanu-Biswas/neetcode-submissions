class MinStack {

    Node head;
    int size;
    int min;

    public MinStack() {
        head = null;
        size=0;
    }
    
    public void push(int val) {
        Node nd =new Node(val);
        nd.next=head;
        size++;

        if(size==1){
            nd.min=val;
        }else if(head.min<val){
            nd.min=head.min;
        }else{
            nd.min=val;
        }

        head=nd;
    }
    
    public void pop() {
        if(size>0){
            head=head.next;
            size--;
        }
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}

class Node{
    int data;
    Node next;
    int min;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

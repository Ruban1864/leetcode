class MyLinkedList {
    private Node head ;
    private int size;
    static class Node{
        int val ;
        Node next ;
        public Node(int val ){
            this.val = val;
            this.next = null ;
        }
        public Node(int val , Node next){
            this.val = val ;
            this.next = next ;
        }
    }
    public MyLinkedList() {
        head = null;
        size = 0 ;
    }
    
    public int get(int index) {
        if( index < 0 || index >= size ) return -1;
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
         Node newNode = new Node(val,head);
         head = newNode;
         size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if ( head == null ){
            head = newNode;
        }else{
            Node temp = head;
            while( temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if( index < 0 || index > size ) return;
        if( index == 0){
            addAtHead(val);
            return;
        }
        Node curr = head;
        for(int i = 0 ; i < index - 1 ; i++){
            curr = curr.next;
        }
        Node nn = new Node(val,curr.next);
        curr.next = nn;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if( index < 0 || index >= size ) return;
        if( index == 0){
            head = head.next;
        }else{
            Node curr = head;
            for(int i = 0 ; i < index - 1 ; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
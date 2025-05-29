class MyLinkedList {
    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
   private Node head;
   private int size;
   public MyLinkedList() {
     head = null;
     size = 0;
    }
 public int get(int index) {
        if(index < 0 || index >= size ){
            return -1;
        }
        Node current = head;
        for(int i=0;i<index;i++){
            current = current.next;
        }
        return current.val;        
    }
  public void addAtHead(int val) {
       Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node current = head;
        Node newnode = new Node(val);
        if(head==null){
          head = newnode;
          size++;
          return;
        }
        while(current.next!=null){
            current = current.next;
        }
       current.next = newnode;
       size++;
   }
   public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        if(index==0){
             addAtHead(val);
             return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node current = head;
        for(int i=0;i<index-1;i++){
            current = current.next;
        }
        Node newnode = new Node(val);
        newnode.next = current.next;
        current.next = newnode;
        size++;
 } 
    public void deleteAtIndex(int index) {
        if(index < 0 || index >=size){
            return;
        }
        if(index==0){
            head = head.next;
        } else {
        Node current = head;
        for(int i=0;i<index-1;i++){
            current = current.next;
        }
        current.next = current.next.next;
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
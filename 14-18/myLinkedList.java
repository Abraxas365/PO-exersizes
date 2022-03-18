public class myLinkedList {
    public Node head;
    
    public myLinkedList(Node head){
        this.head = head;
    }
    
    public void addItem(Node newnode){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newnode;
    }
    
}
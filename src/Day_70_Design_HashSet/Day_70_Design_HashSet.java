package Day_70_Design_HashSet;
class Node{
    Node next;
    int val;
    public Node(int key){
        this.val=key;
        this.next=null;
    }
}
class MyHashSet {
    Node head;
    public MyHashSet() {
       head=null; 
    }
    
    public void add(int key) {
        if(head==null) 
        {
            head= new Node(key);
            return;
        }
        boolean doesExists=contains(key);
        if(!doesExists){
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            
            temp.next=new Node(key);
        }
    }
    
    public void remove(int key) {
        if(head==null) return;
        if(head.val==key){
            head=head.next;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.val==key)
                temp.next=temp.next.next;
            else
                temp=temp.next;
        }
    }
    
    public boolean contains(int key) {
        if(head==null) return false;
        if(head.val==key) return true;
        
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.val==key) return true;
            temp=temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

public class Day_70_Design_HashSet {
    
}
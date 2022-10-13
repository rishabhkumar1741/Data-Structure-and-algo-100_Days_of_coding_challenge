package Day_13_Singly_LinkList;

public class Day_13_Singly_LinkList {
    Node head=null;
    static class Node{
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtBeginning(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head= newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void insertAtEnd(int data)
    {
        Node temp = head;
        Node newnode  = new Node(data);
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newnode;

    }
    public void insertInMiddle(int data,int pos){
         Node temp = head;
         Node newNode = new Node(data);
         for(int i=0;i<pos-2;i++)
         {
            try {
                temp = temp.next;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Postion out of range");
                return;
            }
         }
         newNode.next = temp.next;
         temp.next = newNode;

    }
    public void show()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" =>");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        Day_13_Singly_LinkList obj = new Day_13_Singly_LinkList();
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(9);
        obj.insertAtBeginning(8);
        obj.insertAtBeginning(7);
        obj.insertAtBeginning(6);
        obj.insertAtEnd(100);
        obj.insertInMiddle(60, 10);
        
        obj.show();
        
    }
    
}

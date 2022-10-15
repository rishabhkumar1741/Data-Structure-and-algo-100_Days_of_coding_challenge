package Day_14_Circular_Linked_List;

public class Day_14_Circular_Linked_List {
    Node head = null;
    Node tail = null;
    static class Node {
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    void insertAtBegging(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head= newnode;
            tail = newnode;
            newnode.next = head;
        }
        else{
            newnode.next= head;
            head = newnode;
            tail.next = head;
        }
    }
    void insertionAtEnd(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
            tail=newnode;
            newnode.next= head;
        }
        else{
            tail.next = newnode;
            tail = newnode;
            newnode.next = head;
        }
    }
    void insertAtMiddle(int data,int pos)
    {
        Node newnode = new Node(data);
        Node temp = head;
        for (int i = 0; i < (pos-1); i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;   
       
    }
    void deletionForTheBeginning()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
        }
        else{
            
        }
    }
    void print()
    {
        Node temp = head;   
        if(head==null)
        {
            System.out.println("LL is empty");

        }
        else{
            do{
                System.out.print("==> "+temp.data);
                temp = temp.next;
            }while(temp!=head);
        }

    }

    public static void main(String[] args) {
        Day_14_Circular_Linked_List obj = new Day_14_Circular_Linked_List();
        obj.insertAtBegging(10);
        obj.insertAtBegging(20);
        obj.insertAtBegging(30);
        obj.insertAtBegging(40);
        obj.insertAtBegging(50);
        obj.insertionAtEnd(100);
        obj.insertionAtEnd(200);
        obj.insertAtMiddle(1000, 3);
        obj.print();
    }

    
}

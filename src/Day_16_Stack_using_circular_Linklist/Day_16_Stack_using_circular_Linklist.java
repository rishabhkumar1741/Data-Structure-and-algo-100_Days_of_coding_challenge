package Day_16_Stack_using_circular_Linklist;

public class Day_16_Stack_using_circular_Linklist {
    Node top=null;
    Node tail=null;

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data =data;
            this.next = null;
        }
        
    }
    void push(int data)
        {
            Node newnode = new Node(data);
            if(top==null)
            {
                top= newnode;
                tail=newnode;
                newnode.next = top;
            }
            else{
                newnode.next= top;
                top = newnode;
                tail.next =top;
            }
        }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack Is Empty");
        }
        else{
            top = top.next;
            tail.next = top;
        }
    }
    void display()
    {
        if(top==null)
        {
            System.out.println("Print stack is empty");
        }
        else{
            Node temp = top;
            
            if(temp==null)
            {
                System.out.println("Print stack is empty");
            }
            else
            {
                do {
                    System.out.print(" ==> "+temp.data);
                    temp = temp.next;
                } while (temp!=top);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Day_16_Stack_using_circular_Linklist obj = new Day_16_Stack_using_circular_Linklist();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.display();
        obj.pop();
        obj.display();
    }

   
    
}

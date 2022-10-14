package Day_12_Stack_Using_LinkList;

import java.util.Scanner;

public class Day_12_Stack_Using_LinkList {
    Node top = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(int data) {
        Node newnode = new Node(data);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }

    void print() {
        Node temp = top;
        if (temp == null) {
            System.out.println("stack is empty");
        }
        while (temp != null) {
            System.out.print(" ==>" + temp.data);
            temp = temp.next;
        }
        System.out.println();

    }

    void pop() {
        if (top == null) {
            System.out.println("stack is empty ");
        } else {
            top = top.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Program start");
        Scanner sc = new Scanner(System.in);
        int choose = 1;
        Day_12_Stack_Using_LinkList obj = new Day_12_Stack_Using_LinkList();
        System.out.println("Choose 1 for push");
        System.out.println("Choose 2 for pop");
        System.out.println("Choose 3 for print");
        System.out.println("Choose 4 for exit");
        while (choose != 4) {
            System.out.println("Enter your choose");
            choose = sc.nextInt();
            switch (choose) {

                case 1:
                    System.out.println("Enter the element you want to push");
                    int data = sc.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.print();
                    break;

            }

        }
    }
}

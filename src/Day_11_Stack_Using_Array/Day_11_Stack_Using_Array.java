package Day_11_Stack_Using_Array;

import java.util.Scanner;
import java.util.*;
public class Day_11_Stack_Using_Array{
    int top=-1 ;
    int[] arr ;
    int size;
    Day_11_Stack_Using_Array(int size)
    {
        arr = new int[size];
        this.size = size;
    }
    //push
    public void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Overflow");
        }
        else{
            top++;
            arr[top] = data;
            System.out.println(data +" data is inserted");
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("underFlow");
        }
        else{
            
            top--;
        }
    }
    public void display()
    {
        for (int i = top; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Day_11_Stack_Using_Array obj = new Day_11_Stack_Using_Array(5);
        obj.push(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(6);
        obj.display();
        obj.pop();
        System.out.println();
        obj.display();
     

        
    }




}


import java.util.*;

// class exampleThread implements Runnable  { 
//     @Override
//     public void run() 
//     {
//         try
//         {
//             Thread.sleep(1000);
//             for (int i = 0; i < 20; i++) {
//                     if(i%2==0)
//                     {
//                         System.out.println("even");
//                     }
//             }
//         }
//         catch(Exception e)  {
//             System.out.println("Rishabh"); 
//         }
        
//     }

// }
// class exampleThread1 implements Runnable  { 
//     @Override
//     public void run() 
//     {
//         try
//         {
            
//             for (int i = 0; i < 20; i++) {
//                     if(i%2!=0)
//                     {
//                         System.out.println("odd");
//                     }
//             }
//         }
//         catch(Exception e)  {
//             System.out.println("Rishabh"); 
//         }
        
//     }

// }



public class App {
 

    public static void main(String[] args)  {
        // exampleThread obj = new exampleThread();
        // exampleThread1 obj1 = new exampleThread1();
        // Thread t1 = new Thread(obj);
        // Thread t2 = new Thread(obj1);
        // t1.sleep(10234);
        // t1.setPriority(10);
        // t2.setPriority(9);
        // t1.start();
        // t2.start();


        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(10, 100);
        // System.out.println(map.containsKey(10));
        System.out.println("rishabh");


        int arr[] = {90,80,70,60,50};
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println("i am i "+i);
            for(int j=0;j<arr.length-i-1;j++)
            {
                System.out.println(j);
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }




        
        
     
        
    
    }
}

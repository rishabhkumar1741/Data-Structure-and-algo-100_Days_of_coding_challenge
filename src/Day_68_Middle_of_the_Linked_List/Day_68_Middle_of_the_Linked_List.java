package Day_68_Middle_of_the_Linked_List;
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode temp = head;
//         ListNode newtemp = temp;
//         int length=-1;
//         int iteration=-1;
//         while(temp!=null)
//         {
//             length++;
//             temp = temp.next;
//         }
//         if(length%2==0)
//         {
//             iteration= length/2;
//         }
//         else{
//             iteration = (length/2) +1;
//         }
//         int i=0;
//         temp = head;
//         while(temp!=null)
//         {
//             if(i<iteration)
//             {
//                 temp = temp.next;
//                 i++;
//                 continue;
//             }
//             newtemp = temp;
//             break;
//         }
//         return newtemp;
//     }
// }

public class Day_68_Middle_of_the_Linked_List {
    
}

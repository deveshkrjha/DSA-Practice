package LINKEDLIST;
// 876. Middle of the Linked List
// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.
// Examples:
// Input: Linked list: 1->2->3->4->5
// Output: 3
// Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
// Input: Linked list: 2->4->6->7->5->1
// Output: 7 
// Explanation: The given linked list is 2->4->6->7->5->1 and its middle is 7.

import java.lang.classfile.components.ClassPrinter.ListNode;

public class middleNode {
    //NAIVE SOLUTION 
    //TIME COMPLEXITY: O(n) but two loops are running sequential not nested thats why its O(n). 
    public ListNode middle(ListNode head) {
        if(head==null)  return null;
        ListNode curr;
        int count=1;
        for(curr=head;curr.next!=null;curr=curr.next){
            count++;
        }
        curr=head;
        for(int i=0;i<(count/2);i++)
            curr=curr.next;
        return curr;
    }

    //OPTIMAL SOLUTION
    //TIME COMPLEXITY: O(n) and only one loop is running.
    public ListNode middle(ListNode head) {
        if(head==null)  return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

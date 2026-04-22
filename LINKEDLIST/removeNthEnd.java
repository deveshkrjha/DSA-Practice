package LINKEDLIST;

import java.lang.classfile.components.ClassPrinter.ListNode;

// 19. Remove Nth Node From End of List
// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Example 1:
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:
// Input: head = [1], n = 1
// Output: []
// Example 3:
// Input: head = [1,2], n = 1
// Output: [1]
public class removeNthEnd {
    //METHOD 1: Using Length of Linked List
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)  return null;
        int count=0;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            count++;
        }
        if(n==count){
            head=head.next;
            return head;
        }
        ListNode curr=head;
        for(int i=1;i<count-n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}

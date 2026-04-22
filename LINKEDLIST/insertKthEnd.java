package LINKEDLIST;
// Kth from End of Linked List
// You are given the head of a linked list and the number k, You have to return the kth node from the end of linkedList. If k is more than the number of nodes, then the return -1.

// Examples
// Input: LinkedList: 1->2->3->4->5->6->7->8->9, k = 2
// Output: 8
// Explanation: The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.

// Input: LinkedList: 10->5->100->5, k = 5
// Output: -1
// Explanation: The given linked list is 10->5->100->5. Since 'k' is more than the number of nodes, the output is -1.
public class insertKthEnd {
    //METHOD 1: Using Length of Linked List
    int getKthFromLast(Node head, int k) {
        // Your code here
        int count=0;
        for(Node curr=head;curr!=null;curr=curr.next){
            count++;
        }
        if(k>count) return -1;
        Node curr=head;
        for(int i=1;i<count-k+1;i++){
            curr=curr.next;
        }
        return curr.data;
    }

    //METHOD 2: Using Two REFERENCE/Pointer Technique
     int getKthFromLast(Node head, int k) {
        // Your code here
        if(head==null)  return -1;
        Node first=head;
        Node second=head;
        for(int i=0;i<k;i++){
            if(first==null) return -1;
            first=first.next;
        }
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        return second.data;
}

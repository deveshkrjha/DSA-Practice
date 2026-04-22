package LINKEDLIST;
//Insert in a Sorted List
// Given a linked list sorted in ascending order and an integer called key, insert data in the linked list such that the list remains sorted.

// Examples:
// Input: LinkedList: 25->36->47->58->69->80, key: 19
// Output: 19->25->36->47->58->69->80
// Input: LinkedList: 50->100, key: 75
// Output: 50->75->100
public class insertSortedList {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node res=new Node(key);
        Node curr=head;
        if(head==null) return res;
        if(head.data>key){
            res.next=head;
            return res;
        }
        while(curr.next!=null && curr.next.data<key){
            curr=curr.next;
        }
        res.next=curr.next;
        curr.next=res;
        return head;
    }   
}

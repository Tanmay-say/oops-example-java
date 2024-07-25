package Linkedlistoperations;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class LinkedListClass {
    public static ListNode middle(ListNode head){
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next!= null) {
        fast = fast.next.next;
        slow = slow.next;
    }        
    return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode middleNode = middle(head);
        System.out.println("The middle element is: " + middleNode.val); 
    }
}

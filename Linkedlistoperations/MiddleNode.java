package Linkedlistoperations;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleNode {

    // Method to find and delete the middle node
    public static ListNode deleteMiddle(ListNode head) {
        // Edge case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return null;
        }
        
        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        // Delete the middle node
        if (prev != null) {
            prev.next = slow.next;
        }
        
        return head;
    }

    // Method to find the middle node (not deleting it)
    public static ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
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

        head = deleteMiddle(head);
        ListNode current = head;
        System.out.print("Updated list after deleting the middle node: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

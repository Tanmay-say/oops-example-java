package Linkedlistoperations;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeLinkedList {

    // Method to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // While both lists are not empty
        while (l1 != null && l2 != null) {
            // Compare the values and attach the smaller node to the merged list
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach the remaining part of the list, if any
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Return the merged list, which starts at dummy.next
        return dummy.next;
    }
    public static void print(ListNode current){
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // Creating the first sorted linked list: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        System.out.println("First List");
        print(l1);
        // Creating the second sorted linked list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        System.out.println("\nSecond List");
        print(l2);

        ListNode mergedHead = mergeTwoLists(l1, l2);

        System.out.print("\nMerged list: ");
        ListNode current = mergedHead;
        print(current);
    }
}

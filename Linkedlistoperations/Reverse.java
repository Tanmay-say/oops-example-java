package Linkedlistoperations;
class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
public class Reverse {
    
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode perv = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next=perv;
            perv=curr;
            curr=temp;
        }
        head = perv;
        return head ;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode reversedHead = reverse(head);

        System.out.print("The reversed linked list is: ");
        printList(reversedHead);
    }
}

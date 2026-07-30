/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        // ListNode slowPointerPrev = head;
        ListNode slowPointer = head;
        // ListNode fastPointer = head;
        ListNode fastPointer = head.next.next;

        while(fastPointer!=null && fastPointer.next!=null){
            // slowPointerPrev = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        // slowPointerPrev.next=slowPointer.next;
        // slowPointer.next = null;
        slowPointer.next = slowPointer.next.next;
        return head;

    }
}
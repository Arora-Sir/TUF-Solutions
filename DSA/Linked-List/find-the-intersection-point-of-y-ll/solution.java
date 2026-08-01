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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA!=tempB){
            tempA=tempA==null ? headB : tempA.next;
            tempB=tempB==null ? headA : tempB.next;
        }
        return (tempA!=null)?tempA:null;
    }
}

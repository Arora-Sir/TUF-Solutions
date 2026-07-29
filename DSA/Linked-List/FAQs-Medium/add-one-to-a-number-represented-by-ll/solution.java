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
    public ListNode addOne(ListNode head) {
        ListNode temp = reverseList(head);
        ListNode temp1 = temp;
        while(temp1!=null){
            if(temp1.val < 9){
                temp1.val += 1;
                break;
            }
            temp1.val = 0;
            if(temp1.next == null){
                temp1.next = new ListNode(1,null);
                break;
            }
            temp1 = temp1.next;
        }
        temp = reverseList(temp);
        return temp;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        ListNode currNext = head.next;
        while(head!=null){
            if(curr==head) curr.next = null;
            else curr.next=head;
            head=curr;
            if(currNext==null) return head;
            curr=currNext;
            currNext=curr.next;
        }   
        return head;
    }
}
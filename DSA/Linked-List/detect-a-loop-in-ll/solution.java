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
    public boolean hasCycle(ListNode head) {
        //Brute: (Below)
        // Optimial would be using Slow & Fast Pointers : Distance between fast and slow (not slow and fast) will be: d ; d-1 ; d-2...
        HashSet<ListNode> set = new HashSet();
        ListNode curr = head;
        while(curr!=null){
            if(set.contains(curr)){
                return true;
            }
            set.add(curr);
            curr=curr.next;
        }
        return false;
    }
}
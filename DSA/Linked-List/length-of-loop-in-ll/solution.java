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
     public int findLengthOfLoop(ListNode head) {
        HashSet<ListNode> set = new HashSet();
        ListNode curr = head;
        boolean startFound = false;
        ListNode startLoopNode = null;
        int count = 0;
        while(curr!=null){
            if(set.contains(curr)){
                if(startFound && curr == startLoopNode) return count;
                if(!startFound){
                    startFound = true;
                    startLoopNode = curr;
                }
            }
            if(startFound){
                count++;
            }
            set.add(curr);
            curr=curr.next;
        }
        return 0;
     }
 }
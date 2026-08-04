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
        int count = 0;
        HashMap<ListNode,Integer> map = new HashMap();
        ListNode curr = head;
        boolean startFound = false;
        ListNode startLoopNode = null;
        while(curr!=null){
            if(map.containsKey(curr)){
                return count-map.get(curr)+1;
                // if(startFound && curr == startLoopNode) return count;
                // if(!startFound){
                    // startFound = true;
                    // startLoopNode = curr;
                // }
            }
            // if(startFound){
            //     count++;
            // }
            map.put(curr,++count);
            curr=curr.next;
        }
        return 0;
     }
 }
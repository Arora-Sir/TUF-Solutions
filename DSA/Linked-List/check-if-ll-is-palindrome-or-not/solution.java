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
  public boolean isPalindrome(ListNode head) {
    // Brute: Using Stack : O(2N) & O(N) : Stack<Integer> stack = new Stack<>();
    // Optimial: O(2N) : Finding the middle & reversing the second half and then traverse whole from
    // the start.
    // eg. 12345 : After reversal: (1234 -> null) & (54 -> null)

    if (head == null || head.next == null) return true;
    ListNode slow = head, fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode reversedCopy = null;
    ListNode curr = slow.next;

    while (curr != null) {
      ListNode newNode = new ListNode(curr.val,reversedCopy);
      reversedCopy = newNode;
      curr = curr.next;
    }

    ListNode first = head;
    ListNode second = reversedCopy;

    while (second != null) {
      if (first.val != second.val) {
        return false;
      }

      first = first.next;
      second = second.next;
    }

    return true;
  }
}

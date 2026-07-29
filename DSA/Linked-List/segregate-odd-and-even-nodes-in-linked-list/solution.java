class Solution {
    // Function to segregate odd and even indices nodes
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        List<Integer> array = new ArrayList<>();   
        ListNode temp = head;
        int k=2;
        while(k>0)
        {
            while (temp != null && temp.next != null) {
                array.add(temp.data);
                temp = temp.next.next;
            }
            if (temp != null) array.add(temp.data);
            temp = head.next;
            k--;
        }
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.data = array.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }
}

  //Definition for singly-linked list.
class ListNode206 {
    int val;
    ListNode206 next;
    ListNode206() {}
    ListNode206(int val) { this.val = val; }
    ListNode206(int val, ListNode206 next) { this.val = val; this.next = next; }
}
class Solution206 {
    public ListNode206 reverseList(ListNode206 head) {
        if(head == null)
            return null;
        ListNode206 presentNode = head, preNode = null, nextNode = head.next;
        while(presentNode != null) {
            presentNode.next = preNode;
            preNode = presentNode;
            presentNode = nextNode;
            if(nextNode != null) {
                nextNode = nextNode.next;
            }
        }
        return preNode;
    }
}
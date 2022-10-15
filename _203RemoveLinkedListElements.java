 // Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode traversal = head, preNode = null;
        while(traversal != null) {
            if(traversal.val == val) {
                preNode.next = traversal.next;
                traversal = traversal.next;
            } else {
                preNode = traversal;
                traversal = traversal.next;
            }
            
        }
        return head;
    }
}
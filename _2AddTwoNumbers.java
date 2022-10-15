public class _2AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode returnNode = new ListNode();
            ListNode dummyNode = returnNode;
            int c = 0, num = 0;
            while(l1 != null || l2 != null) {
                if(l1 != null) {
                    num += l1.val;
                    l1 = l1.next;
                }
                    
                if(l2 != null) {
                    num += l2.val;  
                    l2 = l2.next;
                }   
                num += c;
                
                if(num == 10) {
                    c = 1;
                }
                else {
                    c = (num >= 10) ? (num / 10) : 0 ;
                }
                    
                // System.out.println(num + ", " + c);
                dummyNode.next = new ListNode(num % 10);
                dummyNode = dummyNode.next;
                num = 0;
            }
            if(c != 0) {
                dummyNode.next = new ListNode(c);
                dummyNode = dummyNode.next;
            }
            return returnNode.next;
        }
    }
}
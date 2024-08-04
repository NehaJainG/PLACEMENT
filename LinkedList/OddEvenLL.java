public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode oddHead = new ListNode(0);

        ListNode oddTail = oddHead;
        ListNode p = head;

        while(p.next != null && p.next.next != null){
            oddTail.next = p.next;
            p.next = p.next.next;
            oddTail = oddTail.next;
            oddTail.next = null;
            p = p.next;

        }
        if(p.next != null){
            oddTail.next = p.next;
            p.next = null;
        }
        
        p.next = oddHead.next;

        return head;        
    }
}

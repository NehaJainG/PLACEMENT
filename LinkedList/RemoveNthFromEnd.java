public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }

        if(n == len){
           return head.next;
        }

        int pos = len - n + 1;
        temp = head;
        while(temp.next != null && --pos > 1){
            temp = temp.next;
        }
        temp.next = temp.next == null ? null : temp.next.next ;
    
        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0 ; i < n; i++) fast = fast.next;

        while(fast != null && fast.next != null ){
            fast = fast.next;
            slow = slow.next;
        }
        
        if(fast == null) return head.next;
        slow.next = slow.next == null ? null : slow.next.next;
    
        return head;
    }
}

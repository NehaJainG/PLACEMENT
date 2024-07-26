public class DeleteNode {
    public void deleteNode(ListNode node) {
        // int temp = node.val;
        // while(node.next.next != null){
        //     node.val = node.next.val;
        //     node = node.next;
        // }
        // node.val = node.next.val;
        // node.next = null;
        //System.out.print(node.next);
        //ListNode tempNode = new ListNode(temp);
        node.val = node.next.val;

        node.next = node.next.next;

        
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head; 
        ListNode slow = head;

        while(fast.next.next != null && fast.next.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public ListNode deleteMiddle2(ListNode head) {
        //the same code but little improvision
        if(head == null || head.next == null) return null;
        ListNode fast = head; 
        ListNode slow = head;

        fast = fast.next.next;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}

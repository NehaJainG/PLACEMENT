public class ReverseNodesInKGroups {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode nn = head.next;
        head.next = null;
        while(nn != null){
            ListNode temp2 = nn.next;
            nn.next = curr;
            curr = nn;
            nn = temp2;
        }

        return curr;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int c = k;
        ListNode temp = head;
        ListNode newHead = head;
        ListNode kthNode = head;
        while(kthNode != null && c > 1){
            kthNode = kthNode.next;
            c--;
        }
        if(kthNode != null){
        ListNode nextNode = kthNode.next;
        kthNode.next = null;
        newHead = reverse(temp);
        temp.next = reverseKGroup(nextNode,k);
        }
        
        return newHead;
    }
}

public class ReverseLinkedList {
    /**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        
        ListNode current = head;
        ListNode nextNode = head.next;
        current.next = null;
        while(nextNode != null){
            ListNode temp = nextNode.next;
            nextNode.next = current;
            current = nextNode;
            nextNode = temp;
        }

        return current;
    }

    public ListNode reverseList2(ListNode head) {
        //recursion method
        if(head == null || head.next == null) return head;
        ListNode tempPrev = reverseList(head.next);
        ListNode temp = tempPrev;
        head.next = null;
        while(temp.next != null) temp = temp.next;
        temp.next = head;
        return tempPrev;
    }

    public ListNode reverseList3(ListNode head) {
        //recursion method more optimal one
        if(head == null || head.next == null) return head;
        ListNode tempPrev = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return tempPrev;
    }
}


import java.util.HashSet;

public class DetectLoop {
    public boolean hasCycle(ListNode head) {
        //optimal
        ListNode sp = head;
        ListNode fp = head;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(fp == sp) return true;
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {
        //brute force: requires O(n) space
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        ListNode temp =  head;
        while(temp != null){
            if(nodes.contains(temp)) return true;
            nodes.add(temp);
            temp=temp.next;
        }

        return false;
    }
}

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        while(temp.next != null){
            //System.out.println(temp.val + ",");
            ListNode min = temp;
            ListNode temp2 = temp.next;
            while(temp2 != null){
                //System.out.print(temp2.val + " ");
                if(min.val > temp2.val){
                    min = temp2;
                }
                temp2 = temp2.next;
            }
            //System.out.println("min: " + min.val);
            
            int tempData = temp.val;
            temp.val = min.val;
            min.val = tempData;

            temp = temp.next;
        }

        return head;
        
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
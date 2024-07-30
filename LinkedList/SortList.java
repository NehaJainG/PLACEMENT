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

    ListNode merge(ListNode leftHead, ListNode rightHead){
        ListNode ltemp = leftHead;
        ListNode rtemp = rightHead;

        ListNode head = new ListNode(0);
        ListNode listPtr = head;

        while(ltemp != null && rtemp != null){
            if(ltemp.val < rtemp.val){
                listPtr.next = ltemp;
                ltemp = ltemp.next;
            }else{
                listPtr.next = rtemp;
                rtemp = rtemp.next;
            }
            listPtr = listPtr.next;
        }

        if(ltemp != null){
            listPtr.next = ltemp;
        }else{
            listPtr.next = rtemp;
        }

        return head.next;
    }
    public ListNode sortList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode middle = head, fp = head;
        while(fp.next != null && fp.next.next != null){
            fp = fp.next.next;
            middle = middle.next;
        }

        ListNode left = head, right = middle.next;
        middle.next = null;
        left = sortList(left);
        right = sortList(right);
        return merge(left,right); 
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
public class IntersectionOfLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //brute force method.
        ListNode d1 = headA;
        while(d1 != null){
            ListNode d2 = headB;
            while(d2 != null){
                if(d1 == d2) return d1;
                d2 = d2.next;
            }
            d1 = d1.next;
        }

        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        //optimal approach
        //calculate length of both linkedlist
        //move the ptr of large ll such that the len of both linked is same
        //move both the pointers untill you find the node which is common in both the list
        //return any one of the pointer.
        int alen = 0, blen = 0;
        ListNode d1 = headA, d2 = headB;
        while(d1 != null){
            alen++;
            d1 = d1.next;
        }
        while(d2 != null){
            blen++;
            d2 = d2.next;
        }

        d1 = headA;
        d2 = headB;

        while(alen > blen){
            d1 = d1.next;
            alen--;
        }

        while(blen > alen){
            d2 = d2.next;
            blen--;
        } 

        while(d1 != d2){
            d1 = d1.next;
            d2 = d2.next;
        }

        return d1;
    }

    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        //same as previous approach. code is smaller.
        if(headA == null || headB == null) return null;
        ListNode da = headA, db = headB;
        while(da != db){
            da = da == null ? headB : da.next;
            db = db == null ? headA : db.next;
        }
        return da;
    }
}

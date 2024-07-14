public class MiddleElement {
    public ListNode middleNode(ListNode head) {
        ListNode sp = head, fp = head;
        while(fp != null && fp.next != null){
            sp = sp.next;
            if(fp.next != null) fp = fp.next.next;
            //System.out.println(sp.val + " " + fp.val);
        }

        return sp;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        len = (len / 2);
        temp = head;
        while(len > 0){
            temp = temp.next;
            len--;
        }
        //System.out.print(len);
        return temp;
    }
}

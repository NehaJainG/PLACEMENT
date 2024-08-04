public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //first code
        ListNode sumHead = new ListNode(0);
        ListNode prev = sumHead;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            prev.next = newNode;
            prev = prev.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            ListNode newNode = new ListNode((l1.val + carry) % 10);
            carry = (l1.val + carry) / 10;
            prev.next = newNode;
            prev = prev.next;
            l1 = l1.next;
        }
        while(l2 != null){
            ListNode newNode = new ListNode((l2.val + carry) % 10);
            carry = (l2.val + carry) / 10;
            prev.next = newNode;
            prev = prev.next;
            l2 = l2.next;
        }

        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            prev.next = newNode;
        }

        return sumHead.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        //with same intution and similar logic 
        //but this code looks alot cooler
        ListNode sumHead = new ListNode(0);
        ListNode prev = sumHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum =  carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            prev.next = newNode;
            prev = prev.next;
        }

        return sumHead.next;
    }
}

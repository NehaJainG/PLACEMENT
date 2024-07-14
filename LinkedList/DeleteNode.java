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
}

import java.util.HashMap;

public class CopyWithRandomPtr {
    public Node copyRandomList2(Node head) {
        //uses hashmap additional ds
        Node newHead = new Node(0);
        Node temp = head, curr = newHead;
        HashMap<Node, Node> copy = new HashMap<>();
        while(temp != null){
            Node newNode = new Node(temp.val);
            curr.next = newNode;
            copy.put(temp,newNode);
            curr = curr.next;
            temp = temp.next;
        }
        temp = head; curr = newHead.next;
        while(temp!=null){
            if(temp.random!=null){
                curr.random = copy.get(temp.random);
            }
            temp = temp.next;
            curr = curr.next;
        }
        return newHead.next;
    }

    public Node copyRandomList(Node head) {
        Node newHead = new Node(0);
        Node temp = head, curr = newHead;
        //insert the new node in between of the list.
        while(temp != null){
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
        //connect the random pointers
        temp = head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        //extract the deep copy and original list
        temp = head;
        while(temp!=null){
            curr.next = temp.next;
            curr = curr.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return newHead.next;
    }
}

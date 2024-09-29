import java.util.Scanner;

public class MiddleElement {
    static Node head;

    static void insert(int ele){
        Node newNode = new Node();
        newNode.data = ele;
        newNode.next = head;
        head = newNode;
    }

    static int findMiddleElement(){
        int noOfEle = 0;
        Node temp = head;

        while(temp != null){
            noOfEle++;
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        noOfEle /= 2;
        
        temp = head;
        while (noOfEle != 0) {
            temp = temp.next;
            //System.out.print(temp.data+" "); 
            noOfEle--;  
        }
        return temp.data;
    }

    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node reverseLL(Node h){
        if(h == null) return h;
        Node temp = h;
        Node nextNode = temp.next;
        temp.next = null;

        while(nextNode != null){
            Node temp2 = nextNode.next;
            nextNode.next = temp;
            //System.out.println(nextNode.data +" "+temp.data+" "+temp2.data);
            temp = nextNode;
            nextNode = temp2;
        }

        return temp;
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        head = null;
        for(int i = 1; i <= 5; i++){
            insert(i);
        }
        System.out.println("Before reverse");
        display();
        head = reverseLL(head);
        System.out.println("After reversal");
        display();

        //System.out.println("\nMiddle item "+findMiddleElement());
        sc.close();

    }
}

class Node{
    int data;
    Node next;
}

import java.util.Scanner;

public class DLL {
    public static Node head;


    public static void insertAtBegin(int data){
        Node newNode = new Node(data);
        
        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public static void insertAtEnd(int data){
        if(head == null){
            insertAtBegin(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void insertAtPosition(int data, int pos){
        if(head == null || pos == 1){
            insertAtBegin(data);
            return;
        }
        
        Node temp = head;
        while(pos > 2 && temp.next != null){
            temp = temp.next;
            pos--;
        }
        if(temp.next == null){
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        temp.next.prev = newNode;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void deleteAtBegin(){
        if(head == null) return;
        head = head.next;
        if(head == null) return;    //if it is the last element then do nothing.
        head.prev = null;           //if it has more than one element in the linked list  
    }

    public static void deleteAtEnd(){
        if(head == null){
            return;
        }

        if(head.next == null){
            deleteAtBegin();
        }

        Node temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    public static void deleteAtPosition(int pos){
        if(head == null){
            return;
        }
        if(head.next == null || pos <= 1){
            deleteAtBegin();
        }

        Node temp = head;
        while(pos > 2 && temp.next != null) {
            temp = temp.next;
            pos--;
        }

        if(temp.next == null){
            deleteAtEnd();
            return;
        }

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;      

    }

    public static void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void reverse(){
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev; 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data, pos;
        System.out.println("1.Insert at begin \n2.Insert at end \n3.Insert at position");
        System.out.println("4.Delete at begin \n5.Delete at end \n6.Delete at position");
        System.out.println("7.Display\n8.Reverse \n9.Exit\nEnter the choice:");
        int ch = sc.nextInt();
        while(ch != 9){
            switch (ch) {
                case 1:
                    System.out.print("Enter new element ");
                    data = sc.nextInt();
                    insertAtBegin(data);
                    break;
                case 2:
                    System.out.print("Enter new element ");
                    data = sc.nextInt();
                    insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter new element ");
                    data = sc.nextInt();
                    System.out.print("Enter the position");
                    pos = sc.nextInt();
                    insertAtPosition(data,pos);
                    break;
                case 4:
                    deleteAtBegin();
                    break;
                case 5:
                    deleteAtEnd();
                    break;
                case 6:
                    System.out.println("Enter the position");
                    pos = sc.nextInt();
                    deleteAtPosition(pos);
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    reverse();
                    break;
                default:
                    break;
            }
            System.out.println("Enter the choice");
            ch = sc.nextInt();
            if(ch == 9) sc.close();
        }
    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

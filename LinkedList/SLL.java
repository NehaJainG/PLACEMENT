import java.util.Scanner;

public class SLL {
    static Node head;

    static void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtEnd(int data){
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
    }

    static void insertAtPosition(int data, int position){
        if(head == null || position == 1){
            insertAtBegin(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(position > 2 && temp.next != null){
            temp = temp.next;
            position--;
        }
        newNode.next = temp.next;
        temp.next = newNode;        
    }

    static void deleteAtBegin(){
        if(head == null) return;
        head = head.next;
    }

    static void deleteAtEnd(){
        if(head == null) return;

        if(head.next == null){
            deleteAtBegin();
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    static void deleteAtPosition(int pos){
        if(head == null) return;

        if(head.next == null || pos == 1){
            deleteAtBegin();
            return;
        }
        Node temp = head;
        while(pos > 2 && temp.next.next != null ){
            temp = temp.next;
            pos--;
        }
        temp.next = temp.next.next;
    }


    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int data, pos;
        System.out.println("1.Insert at begin \n2.Insert at end \n3.Insert at position");
        System.out.println("4.Delete at begin \n5.Delete at end \n6.Delete at position");
        System.out.println("7.Display\n8.Exit\nEnter the choice:");
        int ch = sc.nextInt();
        while(ch != 8){
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
                    System.out.println("Enter the position");
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
                    sc.close();
                    break;
                default:
                    break;
            }
            System.out.println("Enter the choice");
            ch = sc.nextInt();
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

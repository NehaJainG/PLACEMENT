import java.util.Scanner;

public class CLL {
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
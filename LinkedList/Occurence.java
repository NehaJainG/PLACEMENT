package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Occurence {
    static int findOccurence(LinkedList<Integer> list, int searchElement){
        int count = 0;

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfElement = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < noOfElement; i++){
            list.add(sc.nextInt());
        }
        
        int searchElement = sc.nextInt();
        int count = 0;

        Iterator<Integer> iterator = list.iterator();
        

        while(iterator.hasNext()){
            if(iterator.next() == searchElement) count++;
        }

        System.out.print("Count: " + count);
        sc.close();
    }
}

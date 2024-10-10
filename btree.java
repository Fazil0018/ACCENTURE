import java.util.*;
public class delete{
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
            
        }
    }
    delete(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);
        
        if (head ==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = newnode;
        }
    }
    public void insertbegin(int k){
        Node newnode = new Node(k);
        
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void insertposition(int pos,int d){
        Node newnode = new Node(d);
        Node temp = head;
        
        for(int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next= newnode;
    }
    public void deletebegin(){
        head = head.next;
    }
    public void deleteposition(int d){
        Node temp = head;
        Node prev = null;
        
        
        for (int i=1;i<d;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        delete list = new delete();
        
        int n = sc.nextInt();
        
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        list.deletebegin();
        
        list.deleteposition(3);
        
        list.display();
    }
}


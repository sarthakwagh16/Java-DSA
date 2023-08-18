package LinkedList;

public class LL_insert_delete {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertAtHead(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    //deletion in linked list
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty :(");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty :(");
            return;
        }
        if(head.next==null){    //only single element is there in the list
            head=null;
        }

        Node prev=head;
        Node curr=head.next;

        while(curr.next!=null){
            curr=curr.next;
            prev=prev.next;
        }
        prev.next=null;
    }


    public static void main(String[] args) {
        LL_insert_delete list=new LL_insert_delete();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
//        list.display();
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();

    }
}

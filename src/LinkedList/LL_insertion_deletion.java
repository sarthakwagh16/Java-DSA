package LinkedList;

class LL{
    Node head;
    class Node{
        String data;
        Node next;


        Node(String val){  //constructor
            this.data=val;
            this.next=null;
        }
    }
    //insert at head
    public void insertAtfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //insert at last
    public void insertAtlast(String data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //delete at head

    public void deleteHead()
    {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }

    //delete last
    public void deleteLast()
    {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        else if(head.next==null){
            head=null;
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr.next!=null){
            curr=curr.next;
            prev=prev.next;
        }
        prev.next=null;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");



    }





}
public class LL_insertion_deletion {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtfirst("my");
        list.insertAtfirst("name");
        list.insertAtfirst("is");
        list.print();
        list.insertAtlast("sarthak");
        list.print();

        list.deleteHead();
        list.print();

        list.deleteLast();
        list.print();
    }
}

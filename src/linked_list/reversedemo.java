package linked_list;

public class reversedemo {

    Node head;
    class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(int data){
        Node newNode=new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        Node currnode=head;
        while (currnode.next!=null) {
            currnode = currnode.next;
        }
        currnode.next=newnode;
    }

    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while (currnode!=null) {
            System.out.print(currnode.data + "-->");
            currnode = currnode.next;
        }
        System.out.println("Null");
    }

    //reverse
    public void reverseiteration(){

        if(head==null || head.next==null){
            return;
        }

        Node prevnode=head;
        Node currnode=head.next;
        while(currnode!=null){
            Node nextnode=currnode.next;
            currnode.next=prevnode;

            prevnode=currnode;
            currnode=nextnode;

        }
        head.next=null;
        head=prevnode;
    }

    public  static void main(String args[]){
        reversedemo r=new reversedemo();
        r.addfirst(3);
        r.addfirst(2);
        r.addlast(4);
        r.print();
        r.reverseiteration();
        r.print();
    }

}

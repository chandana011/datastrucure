package linked_list;

public class insertion {
    //Node creation
    Node head;
    private int size;
    insertion(){
        this.size=0;
    }
    class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first
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

    //add anywhere
    public void addany(int data,int pos){
        if(pos<=0 || pos>=size){
            System.out.println("Invalid position");
            return;
        }
        Node newnode=new Node(data);
        Node currnode=head;
        int i=1;
        while(i<pos-1){
            currnode=currnode.next;
            i=i+1;
        }
        newnode.next=currnode.next;
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

    public int getsize(){
        return size;
    }

    public  static void main(String args[]){
        insertion i=new insertion();
        i.addfirst(3);
        i.addfirst(2);
        i.addlast(4);
        i.print();

        System.out.println(i.getsize());
        i.addany(5,2);
        i.print();
        System.out.println(i.getsize());
    }

}

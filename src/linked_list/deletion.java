package linked_list;

public class deletion {
    Node head;
    private int size;

    deletion(){
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

    public void addfirst(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //traverse
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public int getsize(){
        return size;
    }

    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    public void deletefirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
        size--;

    }
    public void deletelast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        size--;

    }
    //delete anywhere
    public void deleteany(int pos){
        if(pos<=0 ||pos>size){
            System.out.println("invali position");
            return;
        }
        Node currnode=head;
        int i=1;
        while(i<pos-1){
            currnode=currnode.next;
            i=i+1;
        }
        //retrieve element to be deleted
        //int e=currnode.next.data;
        currnode.next=currnode.next.next;
        size--;

    }


    public static void main(String args[]){
        deletion d=new deletion();
        d.addfirst(3);
        d.addfirst(2);
        d.addlast(4);
        d.addlast(5);
        d.addlast(6);
        d.addfirst(1);
        d.print();
        d.deletefirst();
        d.print();
        d.deletelast();
        d.print();
        System.out.println(d.getsize());
        d.deleteany(2);
        d.print();
        System.out.println(d.getsize());
    }

}

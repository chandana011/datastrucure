package linked_list;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;

    }

    class Node{
        //creating a node
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add--first,last
    //first
    public void addfirst(String data){
        Node newnNode=new Node(data);

        if(head==null){
            head= newnNode;
            return;
        }
        newnNode.next=head;
        head=newnNode;
    }

    //to add last
    public void addlast(String data){
        Node newnNode=new Node(data);

        if(head==null){
            head= newnNode;
            return;
        }
        //traverse
        Node currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
        }

        currNode.next=newnNode;
    }

    //print
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deletefirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deletelast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    public int getsize(){
        return size;
    }

    //reverse by iteration
    public void reverseiteration(){

        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextnode=currNode.next;
            currNode.next= prevNode;

            //update
            prevNode=currNode;
            currNode=nextnode;
        }
        head.next=null;
        head=prevNode;

    }
    public Node reverserecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverserecursive(head.next);
        reverserecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }



    public static void main(String args[]){
        LL list=new LL();
        list.addfirst("a");
        list.addfirst("is");

        list.addlast("list");

        list.addfirst("This");
        list.printlist();


        System.out.println(list.getsize());
        list.head=list.reverserecursive(list.head);
        list.printlist();
    }
}

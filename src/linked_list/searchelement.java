package linked_list;

public class searchelement {
    //Node creation

    Node head;
    private int size;

    searchelement() {
        this.size = 0;
    }

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first
    public void addfirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //search
    public int search(int key){
        Node currnode=head;
        int index=0;
        while(currnode!=null){
            if(currnode.data==key)
                return index;
            currnode=currnode.next;
            index++;
        }
        return -1;
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


    public static void main(String args[]){
        searchelement s=new searchelement();
        s.addfirst(4);
        s.addfirst(3);
        s.addfirst(2);
        s.addfirst(1);
        s.print();
        System.out.println(s.getsize());
        System.out.println(s.search(3));

    }

}


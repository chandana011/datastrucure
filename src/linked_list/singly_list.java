package linked_list;

public class singly_list {
    //creating node
    class node{
        int element;
        node next;

        public node(int e,node n){//constructor define
            element=e;
            next=n;
        }
    }

    private node head; //to store reference of first node
    private node tail;
    private int size;

    public singly_list(){
        head=null;
        tail=null;
        size=0;
    }

    public int length(){
        return size;
    }
    //return true if linkedlist is empty
    public boolean isEmpty(){
        return size==0;
    }

    //add elemment to list

    public void adddlat(int e){
        node newest=new node(e,null);
        if(isEmpty())
            head=newest;
        else
            tail.next=newest;
        tail=newest;
        size=size+1;
    }

    //traverse
    public void displae(){
        node p=head;
        while(p!=null){
            System.out.print(p.element+"-->");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        singly_list l= new singly_list();
        l.adddlat(7);
        l.adddlat(4);
        l.adddlat(12);
        l.displae();
        System.out.println("size:"+l.length());
        l.adddlat(8);
        l.adddlat(3);
        l.displae();
        System.out.println("size:"+l.length());
    }

}

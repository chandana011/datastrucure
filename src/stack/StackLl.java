package stack;

public class StackLl {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node top;
    private  int size;

    public StackLl(){
        top=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }


    public void push(int data){
        Node newNode= new Node(data);

        if(isEmpty()){
            top=newNode;
        }
        else {
            newNode.next=top;
            top=newNode;
        }
        size++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int e= top.data;
        top=top.next;
        size--;
        return e;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int e= top.data;;
        return e;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        Node p=top;
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        StackLl sl=new StackLl();
        sl.push(5);
        sl.push(4);
        sl.push(3);
        sl.push(2);
        sl.display();
        System.out.println(sl.pop());
        sl.display();

        System.out.println("size:"+sl.length());

    }



}

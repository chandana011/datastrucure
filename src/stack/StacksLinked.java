package stack;

public class StacksLinked {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node top;
    private int size;

    public StacksLinked(){
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
        Node newNode=new Node(data);

        if(isEmpty()){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }

        size=size+1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        int data=top.data;
        top=top.next;
        size=size-1;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }

        return top.data;
    }

    public void display(){
        Node p=top;
        while (p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String srga[]){
        StacksLinked s= new StacksLinked();
        s.push(5);
        s.push(3);
        s.push(2);
        s.display();
        System.out.println("size:"+s.length());
        System.out.println(s.pop());
        s.display();
    }

}

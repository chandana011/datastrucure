package queue;

public class QueueLinked {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    private Node front=null;
    private Node rear=null;
    private int size=0;

   /* public QueueLinked(){
        front=null;
        rear=null;
        size=0;
    }*/

    public int length(){
        return  size;
    }

    public boolean isempty(){
        return size==0;
    }

    public void enqueue(int data){
        Node newnode = new Node(data);
        if(isempty()){
            front=newnode;
        }
        else{
            rear.next=newnode;

        }
        rear=newnode;
        size++;
    }

    public int dequeue(){
        if(isempty()){
            System.out.println("queue is empty");
            return -1;
        }

        int e=front.data;
        front=front.next;
        size--;
        if(isempty()){
            rear=null;
        }
        return e;
    }

    public void  display(){
        Node p=front;
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinked q=new QueueLinked();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.display();
        q.dequeue();
        q.display();
    }


}

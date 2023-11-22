
package stack;

 class StackLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newnode = new Node(data);

            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack stackInstance = new Stack();

        stackInstance.push(1);
        stackInstance.push(2);
        stackInstance.push(3);
        stackInstance.push(4);

        while (!stackInstance.isEmpty()) {
            System.out.println(stackInstance.peek());
            stackInstance.pop();
        }
    }
}


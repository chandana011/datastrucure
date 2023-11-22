package tree;

public class subtreedemo {
   /* public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class tree{
        static int index=-1;
        public static Node treeing(int arr[]){
            index++;
            if(arr[index]==-1){
                return null;
            }
            Node newest=new Node(arr[index]);
            newest.left=treeing(arr);
            newest.right=treeing(arr);
            return newest;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree t=new tree();
        Node root=t.treeing(arr);
        System.out.println(root.data);
    }*/
}

package tree;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class preorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return  newnode;

        }
    }

    public static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);

    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currrNode=q.remove();
            if(currrNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else {
                System.out.print(currrNode.data+" ");
                if(currrNode.left!=null){
                    q.add(currrNode.left);
                }
                if(currrNode.right!=null);{
                    q.add(currrNode.right);
                }

            }
        }
    }

    public  static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);

        return leftNodes+rightNodes+1;
    }

    public static int sumofnodes(Node root){
         if(root==null){
             return  0;
         }
         int leftsum=sumofnodes(root.left);
         int rightsum=sumofnodes(root.right);

         return leftsum+rightsum+root.data;
    }


    public static int heightoftree(Node root){
        if(root==null){
            return 0;
        }
        int leftheight= heightoftree(root.left);
        int righthright=heightoftree(root.right);

        int myheight=Math.max(leftheight,righthright)+1;

        return myheight;
    }


    public static int diameter(Node root){//time complexity O(n^2)
        if(root==null){
            return 0;
        }
        int dia1=diameter(root.left);
        int dia2=diameter(root.right);

        int dia3=heightoftree(root.left)+heightoftree(root.right)+1;

        return Math.max(dia3,Math.max(dia1,dia2));
    }

    static class  treeinfo{
        int ht;
        int dia;
        treeinfo(int ht,int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static treeinfo diameter2(Node root){//tc=O(N)
        if(root==null){
           return new treeinfo(0,0);
        }
        treeinfo left=diameter2(root.left);
        treeinfo right=diameter2(root.right);

        int myheight=Math.max(left.ht,right.ht)+1;

        int dia1=left.dia;
        int dia2= right.dia;
        int dia3=left.ht+ right.ht+1;
        int mydia=Math.max(dia3,Math.max(dia1,dia2));

        treeinfo myinfo=new treeinfo(myheight,mydia);
        return myinfo;

    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree b=new Binarytree();
        Node root=b.buildtree(nodes);
        System.out.println(root.data);
        Preorder(root);
        System.out.println( );
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        //levelorder(root);
        System.out.println(countNodes(root));
        System.out.println(sumofnodes(root));
        System.out.println(heightoftree(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).dia);

    }

}

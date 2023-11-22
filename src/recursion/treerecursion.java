package recursion;

public class treerecursion {
    //when a function calls itself
    // more than one time in single base condition
    public void sqarecalculate(int n){
        if(n>0){
            sqarecalculate(n-1);
            int k=n*n;
            System.out.println(k);
            sqarecalculate(n-1);
        }
    }
    public static void main(String args[]){
        treerecursion r =new treerecursion();
        r.sqarecalculate(4);
    }

}

package recursion;

public class tailrecursion {
     public void sqarecalculate(int n){
         if(n>0){
             int k=n*n;
             System.out.println(k);
             sqarecalculate(n-1);
         }
     }

     public static void main(String args[]){
         tailrecursion r=new tailrecursion();
         r.sqarecalculate(4);
     }
}

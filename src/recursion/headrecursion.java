package recursion;

public class headrecursion {
    public void sqarecalculate(int n){
        if(n>0){
            sqarecalculate(n-1);
            int k=n*n;
            System.out.println(k);

        }
    }

    public static void main(String args[]){
        headrecursion r=new headrecursion();
        r.sqarecalculate(4);
    }
}

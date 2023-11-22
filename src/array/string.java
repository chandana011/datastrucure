package array;
import java.util.*;


public class string {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String name=sc.next();

       System.out.println(name);


        //charat
       for(int i=0;i<name.length();i++){
           System.out.println(name.charAt(i));
       }

       //compare
        String name1=sc.next();
        String name2=sc.next();

        if(name1.compareTo(name2)==0){
            System.out.println("strings equal");
        }
        else{
            System.out.println("not equal");
        }


    }
}

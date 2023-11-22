package linked_list;
import java.util.*;
public class LL_framework {
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst( "a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            //to compare---->if(list.get(i)==value)
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("Null");
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        //to remove element in index i
        //list.remove(i);
    }

}

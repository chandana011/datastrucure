package String;
import java.util.*;
public class comparision {
    public static void main(String[] args) {
        String s1="hello";
        String s2= new String("hello");
        String s3="Hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}

package recursion;

import java.util.Scanner;

public class string {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        greet(name);
    }

    private static void greet(String name) {
        System.out.println("hello"+" "+name);
    }
}

package String;

import java.util.Scanner;

public class manipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);

        //append
        sb.append("java");
        System.out.println(sb);

        //insert
        //str:hello --->ab->heabllo
        sb.insert(1,"ab");
        System.out.println(sb);

        //replace
        sb.replace(0,2,"b");
        System.out.println(sb);

        //delete
        sb.delete(0,3);
        System.out.println(sb);

    }
}

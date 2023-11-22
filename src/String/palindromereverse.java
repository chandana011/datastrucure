package String;

import java.util.Scanner;

public class palindromereverse {
    static boolean palindromecheck(String input){
        StringBuilder sb=new StringBuilder(input);
        String result=sb.reverse().toString();
        if(result.equals(input)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        if(palindromecheck(s)){
            System.out.print("It is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}

package pattern;

import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        for(int i=0;i<row;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

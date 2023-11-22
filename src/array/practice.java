package array;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        practice p = new practice();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(p.checkpali(array));
    }

    public boolean checkpali(int array[]){

        int start=0;
        int end= array.length-1;
        while(start<end) {
            for (int i = 0; i < array.length; i++) {
                if (array[start]!=array[end])
                    return false;
            }
            start++;
            end--;


        }
        return true;
    }

}

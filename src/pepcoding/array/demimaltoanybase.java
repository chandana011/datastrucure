package pepcoding.array;
import java.util.*;
public class demimaltoanybase {
    public static void main(String[] args) {
        demimaltoanybase d=new demimaltoanybase();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//digigt
        int b = scn.nextInt();//base
        System.out.println(d.getValueInBase(n, b));
        scn.close();
    }

    public static int getValueInBase(int n, int b) {
        int ans_num = 0, multiplier = 1;
        while (n > 0)
        {
            int remainder = n % b;
            n = n / b;
            ans_num = ans_num + remainder * multiplier;
            multiplier *= 10;
        }
        return ans_num;
    }
}

package stack;
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        //char[] charArray = s.toCharArray();

        for (int c:s.toCharArray()) {
            //char c = charArray[i];

            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Solution st =new Solution();
        String[] s = {"{( )}","[]()","[])"};
        for (int i=0;i<s.length;i++) {
            String str = s[i];
            boolean isValid = st.isValid(str);
            System.out.println(s + " is valid: " + isValid);
        }

    }
}

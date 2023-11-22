package String;

public class trimming {
    public static void main(String[] args) {
        String s1=" hello ";
        System.out.println(s1.length());
        System.out.println(s1.trim().length());

        String s2="welcome";
        //trie based dictionary search is used
        System.out.println(s2.startsWith("w"));
        System.out.println(s2.endsWith("m"));
        System.out.println(s2.charAt(3));
        System.out.println(s2.indexOf('c'));

        System.out.println(s2.substring(0,2));
    }
}

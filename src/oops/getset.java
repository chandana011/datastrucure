package oops;
//BY USING GETTERS AND SETTERS WE CAN ACCESS THE PRIVATE ELEMENT
class Account{
    public String name;
    private String password="hello";

    public String getpassword(){           //getters
        return this.password;
    }

     public void setpassword(String pass){
     this.password=pass;            //setters
   }
}

public class getset {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.name="chandana";
        System.out.println(acc.name);
        acc.setpassword("abcd");
        System.out.println(acc.getpassword());
    }
}

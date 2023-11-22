package array;

public class palindrome {
    public static void main(String[] args) {
        palindrome p=new palindrome();
        int arr1[]={1,2,2,1};
        System.out.println(p.isPanlindrome(arr1));


    }

    public boolean isPanlindrome(int arr1[]){

        int start=0;
        int end=arr1.length-1;

        while(start<end){
            for(int i=0;i< arr1.length;i++){
                if(arr1[start]!=arr1[end])
                    return  false;
            }
            start++;
            end--;
        }
        return true;

    }
}

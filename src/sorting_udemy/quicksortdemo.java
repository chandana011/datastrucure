package sorting_udemy;

public class quicksortdemo {
    public void quicksort(int a[],int low,int high){
        if(low<high){
            int pi=partition(a,low,high);
            quicksort(a,low,pi-1);
            quicksort(a,pi+1,high);
        }
    }

    public int partition(int a[],int low,int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;
        do {
            while (i <= j && a[i] <= pivot)
                i = i + 1;
            while (i <= j && a[j] > pivot)
                j = j - 1;
            if (i <= j)
                swap(a, i, j);

        } while (i < j);
        swap(a, low, j);
        return j;
    }

    public void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public void display(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String args[]){
        quicksortdemo s=new quicksortdemo();
        int a[]={3,5,8,9,6,2};
        System.out.println("original array:");
        s.display(a,6);
        s.quicksort(a,0,5);
        System.out.println("array after quicksort:");
        s.display(a,6);
    }

}

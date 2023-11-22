package sorting_udemy;

public class mergesortdemo {
    public void mergesort(int a[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergesort(a,left,mid);
            mergesort(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }

    public void merge(int a[],int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=left;
        int b[]=new int[right+1];
        while(i<=mid && j<=right){
            if(a[i]<a[j]){
                b[k]=a[i];
                i=i+1;
            }
            else{
                b[k]=a[j];
                j=j+1;
            }
            k=k+1;
        }
        while(i<=mid){
            b[k]=a[i];
            i=i+1;
            k=k+1;
        }
        while(j<=right){
            b[k]=a[j];
            j=j+1;
            k=k+1;
        }
        for(int x=left;x<=right;x++){
            a[x]=b[x];
        }
    }

    public void display(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

  public static void main(String args[]){
        mergesortdemo m=new mergesortdemo();
        int a[]={ 3,5,8,9,6,2};
        System.out.println("original array:");
        m.display(a,6);
        m.mergesort(a,0,5);
        System.out.print("sorted array:");
        m.display(a,6);
  }
}

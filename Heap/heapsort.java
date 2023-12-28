import java.util.*;

public class heapsort {

    public static void heapify(int arr[],int i,int size){
        int left=i*2+1;
        int right=i*2+2;
        int maxidx=i;

        if(left<size && arr[left]>arr[maxidx]){
            maxidx=left;
        }
        if(right<size && arr[right]>arr[maxidx]){
            maxidx=right;
        }

        if(maxidx!=i){
            //swap
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;

            heapify(arr,maxidx,size);
        }
    }

    public static void Heapsort(int arr[]){
        //step1-build maxheap
        int  n= arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //step 2- push largest at end
        for(int i=n-1;i>=0;i--){
            //swap
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,3};

        Heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

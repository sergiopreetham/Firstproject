import java.io.*;
import java.lang.*;

class GFG {
    public static int binarySearch(int arr[],int start,int end,int search)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==search)
            {
                return mid;
            }
            else if(arr[mid]>search)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        int arr[]={5,6,10,8,9};//[7,9,8,2,5,3]
        int search = 10;
        int index = binarySearch(arr,0,arr.length-1,search);
        if(index == -1)// -1 == -1
            System.out.println("Value is not present in our array");
        else
            System.out.println("Value found at index = "+ index );

    }
}
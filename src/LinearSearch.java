public class LinearSearch {
    public static int linearsearch(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={23,45,18,98,36};
        int index= linearsearch(arr,36);
        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element is present in index= "+index);
        }
    }
}



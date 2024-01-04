//Merge sort: based on divide and conquer
//Time complexity:O(nlogn)
public class MergeSort {
    //O(logn) 
    public static void divide(int arr[], int si, int ei)//function for splitting the array, si-->start index, ei-->end index
    {
        if(si>=ei)
            return;
        int mid=(si+ei)/2;//(si+(ei-si))/2 is used instead of (si+ei)/2 while solving problems since time complexity issue might occur
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    //O(n) 
    public static void conquer(int arr[], int si, int mid, int ei)
    {
        int merged[]=new int[ei-si+1];//new array to store the sorted elements whose length is the length of the given array :(ei-si+1)
        int idx1=si;//idx1 tracks the first divided array which begins at index si
        int idx2=mid+1;//idx2 tracks the second divided array which begins at index mid+1
        int x=0;//to track merged array 
        while(idx1<=mid && idx2<=ei) //keep sorting until this condition is false(this loop compares both the arrays)
        {
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else
            {
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid) //used to comapare only the first array if the other one is already sorted
        {
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=ei) //used to comapare only the second array if the other one is already sorted
        {
            merged[x]=arr[idx2];
            x++;
            idx2++; 
        }
        for(int i=0, j=si;i<merged.length;i++,j++)
        {
            arr[j]=merged[i]; //copy the elements of the merged array to the original array
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

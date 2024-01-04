//Inserion sort: divide the array into sorted and unsorted parts. An element from the unsorted part is considered and put in the sorted part in a proper position and finally all the elements are sorted
//Time complexitiy:O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        int i;
        for(i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}

//Selection sort: consider the first element and compare it with all the elements one by one in each iteration and if that element is bigger than the element it is compared with(eg: 7 8 3 1 2 when 7 is compared with 3, 3 is smaller and hence 3 is considered as the smallest in the next iteration and it is compared with its succeeding elements one by one )
//The smallest element is retrieved from the entire array and swapped with the element that we consider in each iteration
//Time complexity:O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j]) //eg: 7>3
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
    }
}

//Bubble sort :the two adjacent elements are compared starting from the beginning and if a larger element comes before a smaller one, it is swapped 
//Time complexity: O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++) //arr.length-i-1 since we don't consider the element sorted after the first iteration
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

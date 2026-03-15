package Dsa.Sort;

public class Buublesort {
    static void swap(int arr[],int i,int j)
    {
        int temp;
        temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={5,2,9,1,3};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i]>arr[i+1]) {
                    swap(arr,i,i+1);
                }
            }
        }
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}

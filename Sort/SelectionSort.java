package Dsa.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={7,5,2,3,1,4};
        for (int i = 0; i < a.length-1; i++) {
            int min= i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[min]) {
                    min=j;
                }
            }
            int temp= a[i];
            a[i]= a[min];
            a[min]= temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}

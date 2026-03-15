package Dsa.Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]={9,6,3,4,7,2,0};
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j;
            for (j = i-1; j >=0; j--) {
                if (a[j]<key) {
                    break;
                }
                a[j+1]= a[j];
            }
            a[j+1]= key;
        }
        for (int i : a) {
            System.out.println(" "+i);
        }
    }
}

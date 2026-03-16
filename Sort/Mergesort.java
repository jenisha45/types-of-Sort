public class Mergesort {

    void dividing(int a[], int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;

            dividing(a, lb, mid);
            dividing(a, mid + 1, ub);

            merge(a, lb, mid, ub);
        }
    }

    void merge(int a[], int lb, int mid, int ub) {

        int i = lb;
        int j = mid + 1;
        int k = lb;

        int b[] = new int[a.length];

        while (i <= mid && j <= ub) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }

        while (j <= ub) {
            b[k] = a[j];
            j++;
            k++;
        }

        for (int l = lb; l <= ub; l++) {
            a[l] = b[l];
        }
    }

    public static void main(String[] args) {

        int a[] = {9, 5, 7, 8, 9, 10};

        Mergesort obj = new Mergesort();

        obj.dividing(a, 0, a.length - 1);

        for (int i : a) {
            System.out.println(i);
        }
    }
}
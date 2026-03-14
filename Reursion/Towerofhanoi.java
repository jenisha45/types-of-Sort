package Dsa.Reursion;

public class Towerofhanoi {
    static void solve(int n,char A,char B,char C)
    {
        if (n==1) {
            System.out.println("move disk 1 from rod  "+A+" to rod "+B);
            return;
        }
        solve(n-1, A, C, B);
        System.out.println("move disk " +n+"from rod "+A+" to rod "+B);
        solve(n-1, C, B, A);
    }
    public static void main(String[] args) {
        int n=3;
        solve(n, 'a', 'b', 'c');
    }
}

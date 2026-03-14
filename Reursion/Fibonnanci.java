package Dsa.Reursion;

import java.util.Scanner;

public class Fibonnanci {
    static int fib(int n)
    {
        if (n==0 || n==1) {
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a  number =");
        int x= input.nextInt();
        int y= fib(x);
        System.out.println("the output= "+y);
    }
}

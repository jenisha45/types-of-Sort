package Dsa.Reursion;

import java.util.Scanner;

public class Factorial {
    static int recur(int n)
    {
        if(n<=1)
            return 1;
        else
            return n*recur(n-1);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a  number =");
        int x= input.nextInt();
        int y= recur(x);
        System.out.println("the output= "+y);
    }
}

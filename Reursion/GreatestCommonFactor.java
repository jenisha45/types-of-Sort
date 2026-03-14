package Dsa.Reursion;

public class GreatestCommonFactor {
    static int gcd(int x,int y)
    {
        if (y==0) {
            return x;
        } else {
            return gcd(y,x%y);
        }
    }
    public static void main(String[] args) {
        int a= 248, b=48;
        System.out.println(gcd(a,b));
    }
}

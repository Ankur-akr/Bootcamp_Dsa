package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(fibo2(10));
        System.out.println(fiboIterative(10));
    }
    static int fibo(int n){
        if(n==0) return 0;    //base case
        if(n==1) return 1;    //base case
        return fibo(n-1)+fibo(n-2);
    }
    static int fibo2(int n){
        //base case
        if(n<2) return n;
        return fibo2(n-1)+fibo2(n-2);
    }
    static int fiboIterative(int n){
        if (n <= 1) return n;  //base case
        int a = 0 , b = 1;
        for(int i = 2; i<=n; i++){
            int c =a+b;
            a=b;
            b=c;
        }
        return b;
    }
}

package Recursion;

public class Message {
    public static void hello(int n){
        if(n<5){
            System.out.println("Hello world , n = "+n);
            hello(n+1);
        }
    }
    public static void main(String[] args) {
        hello(0);
    }
}

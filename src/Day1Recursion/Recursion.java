package Day1Recursion;

public class Recursion {
    //Function calling itself
    public static  void show(int counter){
        //Show() - exactly 5 times
        if (counter <=5){          //base case
            System.out.println("show() - "+counter);
            show(counter += 1);
            System.out.println("BackTrack - "+counter);
        }
    }
    public static void main(String[] args) {
        show(1);
    }
}

import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if( n %2==0)
            System.out.println("Even no");
        else if(n %2 != 0)
            System.out.println("Odd no.");
        else
            System.out.println("Check the input");
    sc.close();
    }
}

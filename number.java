import java.util.*;
public class number {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        if(num>0)
            System.out.println("Positive number");
        else if(num<0)
            System.out.println("Negetive Number");
        else
            System.out.println("Zero");
        
    sc.close();
    }
}

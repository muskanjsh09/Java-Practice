import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class round {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number= ");
        double num= sc.nextDouble();
        DecimalFormat df= new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.FLOOR);

        System.out.println(df.format(num));
    sc.close();

    }
    
}

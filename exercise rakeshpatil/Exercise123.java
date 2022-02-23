package exercise1;
import java.util.Scanner;
public class Exercise123 {
    public static void main(String[] args) {
        int i,n,sum=0;
        System.out.println("INPUT NUMBER OF TERMS IS: ");
        {
            Scanner in= new Scanner(System.in);
            n= in.nextInt();
            System.out.println("\n THE ODD NUMBERS ARE :");
            for(i=1;i<=n;i++)
            {
                System.out.println(2*i-1);
                sum+=2*i-1;
            }
            System.out.println("THE SUM OF ODD NATURAL NUMBER UPTO "+n+"TERMS IS: "+sum);
        }
    }
}

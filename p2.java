import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for TermDeposit and 2 for RecurringDeposit: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter principal, rate and time: ");
                int p=sc.nextInt();
                int r=sc.nextInt();
                int t=sc.nextInt();
                double amount=p*(1+(r/100.0))*t;
                System.out.println("Total Amount is: "+amount);
                break;
            case 2:
            System.out.println("Enter principal, rate and time: ");
            int mi=sc.nextInt();
            int i=sc.nextInt();
            int n=sc.nextInt();
            double am=(mi*n)+(mi*n*(n-1)/2.0*i/100.0*1/12.0);
            System.out.println("Total Amount is: "+am);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

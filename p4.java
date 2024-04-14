import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int ans=0;
        while(n!=0){
            int digit=n%10;
            if(digit==0){
                digit=1;
            }
            ans=ans*10+digit;
            n=n/10;
        }
        n=ans;
        ans=0;
        while(n!=0){
            int digit=n%10;
            ans=ans*10+digit;
            n=n/10;
        }
        System.out.println("Final number is: "+ans);
        sc.close();
    }
}

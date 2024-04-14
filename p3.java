import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum1=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                sum1=sum1+i;
            }
        }

        int sum2=0;
        for(int i=1;i<=b;i++){
            if(b%i==0){
                sum2=sum2+i;
            }
        }
        if(sum1/a==sum2/b){
            System.out.println("Friendly Pair");
        }
        else{
            System.out.println("Not friendly pair");
        }

        sc.close();
    }
}

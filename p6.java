import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];

        System.out.println("Enter elements in the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Printing the original array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int[] ans=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                ans[j++]=a[i];
            }
        }

        for(int i=0;i<n;i++){
            if(a[i]>=0){
                ans[j++]=a[i];
            }
        }
        
        System.out.println("Printing the modified array: ");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();

        sc.close();
    }
}

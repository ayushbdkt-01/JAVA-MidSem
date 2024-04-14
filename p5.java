import java.util.*;
public class p5 {
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
        Arrays.sort(a);

        for(int i=1;i<n-1;i+=2){
           int temp=a[i];
           a[i]=a[i+1];
           a[i+1]=temp;
        }

        System.out.println("Printing the modified array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}

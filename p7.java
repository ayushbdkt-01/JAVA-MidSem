import java.util.*;
public class p7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Enter number of rows/column: ");
        n=sc.nextInt();
        int[][] a=new int[n][n];

        System.out.println("Enter elements in the matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Printing the matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int min;
        int max;
        int c;

        for(int i=0;i<n;i++){

            min=a[i][0];
            c=0;
           for(int j=0;j<n;j++){
            if(a[i][j]<min){
                min=a[i][j];
                c=j;
            }
           }

           max=a[0][c];
           for(int j=0;j<n;j++){
                if(a[j][c]>max){
                    max=a[j][c];
                }
           }

           if(max==min){
            System.out.println("Saddle point is: "+max);
            System.exit(0);
           }
        }
        System.out.println("NO saddle point");
        sc.close();
    }
}

import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary string: ");
        String s=sc.next();
        int count=0;
        for(int i=2;i<s.length();i++){
            if(s.charAt(i-2)=='0' && s.charAt(i)=='0'){
                count++;
            }
        }
        System.out.println("Count: "+count);
        sc.close();
    }
}

import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.next();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u'){
                ans=ans+s.charAt(i);
            }
        }
        System.out.println("Modified string is: "+ans);
        sc.close();
    }
}

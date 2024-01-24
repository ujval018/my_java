//find username domain name and wether it is a google mail or not 
import java.lang.*;
import java.util.*;


public class StudStringMethod{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        String email=obj.nextLine();        
        int n=email.indexOf('@');
        String cmail=email.substring(n+1, n+6);
        String str1=email.substring(0,n);
        String str2=email.substring(n+1);
        int y=cmail.compareToIgnoreCase("gmail");
        if (y==0) {
            System.out.println("it is a google mail");
        }else{
            System.out.println("it is not a google mail");
        }
        System.out.println("user name is "+ str1);
        System.out.println("domain name is "+ str2);

    }

};
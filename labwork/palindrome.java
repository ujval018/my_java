import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number ");
        x=input.nextInt();
        
        int originalNumber = x;
        int reversedNumber = 0;

        while (x != 0) {
            int remainder = x % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            x /= 10;
        }
        if(originalNumber==reversedNumber){
            System.out.println("the given number is a palindrome");
        }else{
            System.out.println("the given number is not a palindrome");
        }

    }
        
}

import java.lang.*;
import java.util.*;

public class Ass1_1{
    int x;
    int y;
    int z;
     
     void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number ");
        x=input.nextInt();
        System.out.println("enter 2nd number ");
        y=input.nextInt();
        System.out.println("enter 3rd number ");
        z=input.nextInt();
     }

     void add(){
        
        System.out.println(x+y+z);
     }

    public static void main(String arg[]){

        Ass1_1 a1=new Ass1_1();
        a1.input();
        a1.add();

    }
}//samiksha alok nss
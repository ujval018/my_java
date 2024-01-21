import java.lang.*;
import java.util.*;

public class StudCgpa{

    float x;
    float y;
    float z;
    float cgpaa;

     void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter dbms marks ");
        x=input.nextInt();
        System.out.println("enter oopj marks ");
        y=input.nextInt();
        System.out.println("enter dss marks ");
        z=input.nextInt();
     }
     float cgpa(){
        return cgpaa=(x+y+z)/300*10;
    
     }
     void output(){
        
        System.out.println("your marks in dbms is "+x);
        System.out.println("your marks in oopj is "+y);
        System.out.println("your marks in dss is "+z);
        System.out.println("-------------------------");
        System.out.print("your cgpa is " + cgpa());
        

     }
     void squencing(){
        input();
        output();
     }


    public static void main(String Arg[]){
        StudCgpa s1=new StudCgpa();
        s1.squencing();        

    }

};
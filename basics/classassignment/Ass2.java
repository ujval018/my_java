//WAP in java which will accept two integers from the command line argument and will display the sum of two numbers.

public class Ass2 {
    public static void main(String[] arg) {
        int ARG[]=new int[2];
        for (int i = 0; i < ARG.length; i++) {
            ARG[i]=Integer.parseInt(arg[i]);
        }
        
        System.out.println(ARG[0]+ARG[1]);        
    }
    
}

//WAP in java which will accept N numbers from command line argument and will display the total number of even, total number of odd, sum of even, sum of odd and the GRAND TOTAL.
public class Ass3 {

    int COUNTER(int ARG[]){
        int countO=0;
        int countE=0;
        int addO=0;
        int addE=0;
        for (int i = 0; i < ARG.length; i++) {
            if (ARG[i]%2==0) {
                countE++;
                addE=addE+ARG[i];
            }
            else{
                countO++;
                addO=addO+ARG[i];
            }
        }
        System.out.println("Total number of odd numbers are "+countO);
        System.out.println("Total of odd numbers is "+addO);
        System.out.println("Total number of even numbers are "+countE);
        System.out.println("Total of even numbers is "+addE);
        return addO+addE;
    }
    public static void main(String[] args) {
        
        int ARG[]= new int[args.length];
        for (int i = 0; i < ARG.length; i++) {
            ARG[i]=Integer.parseInt(args[i]);
        }
        Ass3 obj=new Ass3();
        System.out.println("total of given number are "+ obj.COUNTER(ARG));
    }
    
}

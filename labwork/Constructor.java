

public class Constructor {
    Constructor(){
        System.out.println("this is invoked without parameter on creation of object ");
    }
    Constructor(int n){
        System.out.println("this is a parameterised constructor called upon passing values to the obj "+n);
    }
    public static void main(String[] args) {
        Constructor obj=new Constructor();
        Constructor obj1=new Constructor(9);
    }

};

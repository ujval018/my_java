

public class StaticMethod {

    static int x;
    static void display(){
        System.out.println("this is a static display method can be called without creating object");

    }
    public static void main(String[] args) {
        display();
        x=9;
        System.out.println(x);
    }
}

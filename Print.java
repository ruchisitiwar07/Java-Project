
public class Print{
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        //calling method a
        a();
        //declairing object of class Print and calling method b
        Print b = new Print();
        b.b();
    }

    public static void a() {

          System.out.println(5 + 10);  
    }

    public void b() {

        System.out.println(5-10);
    }


}

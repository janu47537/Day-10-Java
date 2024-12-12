import java.util.*;
abstract class mobileapp{
    abstract void menu();
    abstract void rating();
    abstract void contact();
}
class b extends mobileapp{
    public void menu()
    {
        System.out.println("Hello");
    }
    public void rating()
    {
        System.out.println("Hello Ram");
    }
    public void contact()
    {
        System.out.println("8985137904");
    }
}
public class Abstractclass{
    public static void main(String[]args)
    {
        b a=new b();
        a.contact();
    }
}
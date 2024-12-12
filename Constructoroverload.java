import java.util.*;
public class Constructoroverload{
    String name;
    Constructoroverload()
    {
        name="rajesh";
    }
    Constructoroverload(String name){
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[]){
        Constructoroverload ob=new Constructoroverload();
        ob.display();
        Constructoroverload ob1=new Constructoroverload("Pooja");
        ob1.display();

    }
}

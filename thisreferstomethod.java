import java.util.*;
public class thisreferstomethod{
    void display()
    {
        System.out.println("Hello Students");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String[]args){
        thisreferstomethod ob=new thisreferstomethod();
        ob.dis1();
    }
}
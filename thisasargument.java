import java.util.*;
public class thisasargument{
    String name;
    thisasargument(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String[]args){
        thisasargument ob=new thisasargument("Ram");
        ob.agt();
    }
}
class teacher{
    public void teach(thisasargument s)
    {
        s.dis1();
    }
}
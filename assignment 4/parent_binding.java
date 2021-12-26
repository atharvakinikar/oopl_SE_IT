abstract class parent{
    abstract public void message();
}

class first extends parent{
    public void message()
    {
        System.out.println("This is the first subclass");
    }
}

class second extends parent{
    public void message()
    {
        System.out.println("This is the second subclass");
    }
}

public class parent_binding{
    public static void main(String args[]){
        parent f=new first();
        parent s=new second();
        f.message();
        s.message();
    }
}
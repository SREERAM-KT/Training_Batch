abstract class A{
    abstract void add();
}
public class AbstractClass extends A{
    public void add(){
        System.out.println("Print Main Class");
    }
    public static void main(String[] args) {
        AbstractClass a=new AbstractClass();
        a.add();
    }
}

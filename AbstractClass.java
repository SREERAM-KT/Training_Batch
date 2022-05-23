abstract class Print{
    abstract void print();
}
public class AbstractClass extends Print{
    public void print(){
        System.out.println("Print Main Class");
    }
    public static void main(String[] args) {
        AbstractClass a=new AbstractClass();
        a.print();
    }
}

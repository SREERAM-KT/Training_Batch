interface A{
    void add();
}
interface B{
    void sub();
}
class C implements A,B{
    public void add(){
        System.out.println("add");
    }
    public void sub(){
        System.out.println("sub");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c=new C();
        c.sub();
        c.add();
    }
}

interface A{
    void print();
}
interface B{
    void show();
}
class C implements A,B{
    public void print(){
        System.out.println("print");
    }
    public void show(){
        System.out.println("show");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.print();
    }
}

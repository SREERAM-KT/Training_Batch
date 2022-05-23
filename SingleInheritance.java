class One{
    public void print(){
        System.out.println("print");
    }
}
class Two extends One{
    public void show(){
        System.out.println("show");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Two t=new Two();
        t.show();
        t.print();
    }
}

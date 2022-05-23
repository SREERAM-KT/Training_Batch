class Bat{
    public void show(){
        System.out.println("Bat");
    }
}
class Adidas extends Bat{
    public void print(){
        System.out.println("Adidas");
    }
}
class Gm extends Bat{
    public void print(){
        System.out.println("Gm");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Adidas a=new Adidas();
        Gm g=new Gm();
        a.print();
        a.show();
        g.print();
        g.show();
    }
}
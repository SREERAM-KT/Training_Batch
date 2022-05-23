class Animal{
    public void show(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    public void print(){
        System.out.println("Dog");
    }
}
class Pug extends Dog{
    public void display(){
        System.out.println("Pug");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Pug p=new Pug();
        p.display();
        p.print();
        p.show();
    }
}

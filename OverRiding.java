//Run Time Polymorphism or Method OverRiding
class Parent{
    void add(int a,int b){
        System.out.println("print parent "+(a+b));
    }
}
class Child extends Parent{
    void add(int a,int b,int c){
        System.out.println("print child "+(a+b+c));
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.add(10,20);
        ch.add(30,40,50);
    }
}

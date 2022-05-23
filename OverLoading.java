//Compile time polymorphism or method overloading
public class OverLoading {
    public void add(){
        System.out.println("add");
    }
    public void add(int a){
        System.out.println(a);
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        OverLoading poly = new OverLoading();
        poly.add();
        poly.add(10);
        poly.add(10,20);
    }
}

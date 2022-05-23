public class Constructor {
    int a;
    Constructor() {
        //default
        this.a=1;
    }
    Constructor(int val){
        this.a=val;
    }
    Constructor(Constructor c){
        this.a=c.a;
    }
    public static void main(String[] args) {
        Constructor c1=new Constructor();
        System.out.println("Default Constructor");
        System.out.println(c1.a);
        Constructor c2=new Constructor(10);
        System.out.println("Parameterised Constructor");
        System.out.println(c2.a);
        Constructor c3=new Constructor(c2);
        System.out.println("Copy Constructor");
        System.out.println(c3.a);
    }
}

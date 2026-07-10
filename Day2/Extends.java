package Day2;

public class Extends {
    public static void main(String[] args) {
        Child c = new Child();
        c.test();
        System.out.println(c.name);
    }
}
class Father{
    String name= "张三";
    Father(){}
    Father(String a){
        this.name = a;
    }
    void test(){
        System.out.println("test``````");
    }
}

class Child extends Father{
    String name = "lisi";
    void test(){
        System.out.println(super.name);
    }
}

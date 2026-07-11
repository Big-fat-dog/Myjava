package Day3;

public class Duotai {
    public static void main(String[] args) {
        //多态，声明方式决定了实例能够使用哪个类的方法
        Person p = new Person();
        Person b = new Boy();
        Gay g = new Gay();
        p.test();
        b.test();
        g.test();
    }
}
class Person{
    void test(){
        System.out.println("111");
    }
}
class Boy extends Person{
    void test(){
        System.out.println("122");
    }
}
class Gay extends Person{
    void test(){
        System.out.println("133");
    }
}
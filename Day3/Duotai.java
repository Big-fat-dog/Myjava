package Day3;

public class Duotai {
    public static void main(String[] args) {
        //多态，声明方式并不能实例能够使用哪个类的方法和属性！
        //而是决定了他能使用什么《属性》以及《方法》。
        //意思就是编译看左边（能否用），运行看右边（用哪个）
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
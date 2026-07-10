package Day2;

public class Static {
    public static void main(String[] args) {
        Chinese c = new Chinese();
        c.name = "aaa";
        //和实例对象无关，只和类相关的称之为静态，和类相关的方法称之为静态方法 static
        //很像python里的类方法
        Chinese.kouhai();
        System.out.println(Chinese.age);
    }
}

class Chinese{
    String name;
    static {
        System.out.println("静态代码块执行了");
    }
    static int age=1;
    static void kouhai(){
        System.out.println("丢你老母");
    }
    {
        //普通代码块，在类有了实例后会执行
        System.out.println("114514");
    }
}
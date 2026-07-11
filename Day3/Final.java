package Day3;

public class Final {
    //final修饰变量，类似于const,被修饰的必须赋值。
    //同理final也可以修饰方法，类。除了构造函数。
    public static void main(String[] args) {
        final String name = "张三";
        User20 u = new User20(name);
        System.out.println(u.name);
    }
}
class User20{
    public String name;
    public User20(String n){
        this.name = n;
    }
}
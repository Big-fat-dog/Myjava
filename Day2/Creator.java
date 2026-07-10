package Day2;

public class Creator {
    public static void main(String[] args) {
        Fser user = new Fser("fuck");
        System.out.println(user.name);
    }
}
//类里面构造函数： 类名(){}
//如果不显示写，jvm会创建默认的
class Fser{
    String name;
    Fser(String a){
        this.name = a;
    }
}
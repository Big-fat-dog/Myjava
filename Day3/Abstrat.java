package Day3;

public class Abstrat {
    public static void main(String[] args) {
        //抽象类，不完整的类,无法直接实例化
        // 抽象方法：只声明而无定义
        //模糊即抽象
        //如果一个类里面有抽象方法，那他是抽象类
        //如果是抽象类，那它的方法不一定是抽象方法
        //用子类补全,子类必须实现抽象方法
        //abstract 和final不能同时使用
        fat f = new fat();
        f.set();
    }
}
abstract class Pe{
    public abstract void set();
    public void test(){

    }
}
class fat extends Pe{
    public void set(){
        System.out.println("666");
    }
}
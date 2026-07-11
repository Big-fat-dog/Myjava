package Day3;

public class Always {
    public static void main(String[] args) {
        //java.lang.Object
        Object kk = new bb();

        //toString将对象变为字符串
        String out = kk.toString();
        System.out.println(out);

        //获取内存地址
        int i = kk.hashCode();
        System.out.println(i);

        //判断是否相等(内存地址)
        System.out.println(kk.equals(new Person()));
    }
}
class bb{

}
package Day2;

public class DataTypec {
    public static void main(String[] args) {
        //数据类型的转换
        String name = "san";
        name = "lisi";
        
        //byte->short->int->long->float->double
        byte b = 10;
        short s = b;
        int i =s;
        long lon = i;
        float f =lon;
        double d = f;
        //从小到大可以直接类型转换

        //强制类型转换
        int li = (int) d;
    }
}

package Day2;
public class DataType {
    public static void main(String[] args) {
        //1.比特(bit位)：数据运算的最小存储单位
        //2.字节(byte)：数据最小存储单位。  1byte = 8bit
        //1024byte = 1kb

        //TODO1.整数类型
        //byte:8位
        byte b = 10;
        //short：16位
        short s =10;
        //int：32位
        int i = 10;
        //long：64位
        long l = 10;

        //TODO2.浮点类型：含有小数点(默认的小数是双精度类型，由于数据需要匹配，所以float得在后面加上f)
        //float:单精度
        float f = 1.0f;
        //double:双精度
        double d = 1.0;

        //TODO3.字符类型
        char c = '0';

        //TODO4.布尔类型
        boolean bl = true;

        //TODO5.字符串，属于引用数据类型
        String a = "name";
    }
}

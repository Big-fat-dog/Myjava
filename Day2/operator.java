package Day2;

public class operator {
    public static void main(String[] args) {
        //表达式会有类型转换，记录的结果是类型大的那一个，且表达式最小使用得是int

        //1.二元运算符
        byte a = 10;
        byte b = 10;
        // byte c = a+b;这里会报错，两个byte类型不能满足表达式最小得是int
        int c = (int)a +b;
        byte d =(byte)(a+b);//也可以这么改。

        //2.一元运算符
        //++，--
        int i = 0;
        int j = i;//j=0
        i = i+1;//i=1
        System.out.println("i="+i);
        System.out.println("j="+j);
        byte b1 = 100;
        b1 += 400;
        System.out.println(b1);
    }
}

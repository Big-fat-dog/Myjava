package Day4;

public class MyString {
    public static void main(String[] args) {
        //双引号出来的是同一个对象
        String a = "aa";
        String b = "aa";
        System.out.println(a==b);//true

        char[] cs = {'a','w',','};
        String s = new String(cs);
        System.out.println(s);

        //转移字符 \
        String aa = "\"";
        System.out.println(aa);

        String aaa = a+b+1+55;
        System.out.println(aaa);

        String bbb = aaa.concat(s);
        System.out.println(aaa);
        System.out.println(bbb);

        //TODO字符串比较
        String aaaa = "a";
        String bb = "b";
        System.out.println(aaaa.equals(b));

        int i = aaaa.compareTo(bb);//正数a>b；负数小于，0等于
        System.out.println(i);

        //TODO字符串截取操作,左闭右开
        String ss = " Hello, world ";
        System.out.println(ss.substring(0,5));

        //分解字符串
        String[] s1 = ss.split(" ");
        System.out.println(s1[0]);

        //trim去掉字符串首尾空格
        System.out.println(ss.trim()+"!");
        }
}

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
        String ss = " Hello, world zhangsan";
        System.out.println(ss.substring(0,5));

        //分解字符串
        String[] s1 = ss.split(" ");
        System.out.println(s1[0]);

        //trim去掉字符串首尾空格
        System.out.println(ss.trim()+"!");

        //替换：replace
        System.out.println(ss.replace("world","H"));
        System.out.println(ss.replaceAll("zhangsan","H"));

        //大小写转换
        System.out.println(ss.toLowerCase());

        //字符串查找
        char[] chars = ss.toCharArray();
        byte[] bytes = ss.getBytes();
        for(char n:chars){
            System.out.print(n+" ");
        }
        for(byte n:bytes){
            System.out.print(n+" ");
        }
        System.out.println();
        //charAt可以传递索引打印指定位置字符
        System.out.println(ss.charAt(1));

        //判断字符串在什么位置
        System.out.println(ss.indexOf("o"));

        //是否包含
        System.out.println(ss.contains("H"));

        //是否以指定开头,endsWith同理
        System.out.println(ss.startsWith(" "));

        //是否为空,空格不算空
        System.out.println(ss.isEmpty());

        //stringBuilder构建字符串
        //api如append添加
        //reverse反转
        //insert插入，在指定位置插入
        
        StringBuilder sss  = new StringBuilder();
        for(int aaaaa=0;aaaaa<100;aaaaa++){
            sss.append(aaaaa);
        }
        System.out.println(sss.toString());
        }
}

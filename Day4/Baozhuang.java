package Day4;

public class Baozhuang {
    public static void main(String[] args) {
        //包装类
        Byte b= null;
        Short s = null;
        Integer i =null;
        Long lon = null;
        Float f = null;
        Double d = null;
        Character c =null;
        Boolean a = null;

        int i1=10;
        // Integer li = new Integer(li);
        //将基本数据类型变成包装类型
        // Integer ll = Integer.valueOf(i1);
        //可以简化为自动装箱
        Integer ll = i1;

        //还原成int
        int i2 = ll.intValue();

    }
}

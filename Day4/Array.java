package Day4;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //Collection  ArrayList
        ArrayList l = new ArrayList<>();

        //增加数据
        l.add(1);
        l.add("aaa");
        l.add("aaa");
        l.add("aa4");
        l.add("a3a");

        //增加另一个集合
        ArrayList o = new ArrayList<>();
        o.add(1);
        o.add(2);
        o.add(3);
        l.addAll(o);

        //集合数据条数
        System.out.println(l.size());

        //指定位置
        System.out.println(l.get(1));

        //遍历
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        //修改
        Object old = l.set(2,"bbb");
        System.out.println("修改前————"+old);

        //判断
        System.out.println(l.contains("aaa"));

        //数据在索引的位置
        System.out.println(l.indexOf("aaa"));

        //删除
        Object rm = l.remove(2);
        System.out.println("shac__"+rm);

        System.out.println(l);
        //清空集合数据
        // l.clear();
        l.removeAll(o);//清除集合里的某个集合

    }
}

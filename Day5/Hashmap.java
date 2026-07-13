package Day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        //无序的
        HashMap m = new HashMap<>();

        //添加数据
        m.put("a",1);
        m.put("2",12);
        m.put("ac",13);
        System.out.println(m);

        Set<String> keys = m.keySet();
        //迭代器
        Iterator<String> i = keys.iterator();
        //用于判断是否存在吓一跳hasNext
        while(i.hasNext()){
            String key = i.next();
            System.out.println(m.get(key));
        }
    }
}

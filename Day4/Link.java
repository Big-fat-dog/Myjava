package Day4;

import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add('a');
        l.addFirst(22);
        l.add(1,233);
        System.out.println(l.getFirst());
        l.remove(1);
        //获取数据
        System.out.println(l.get(0));
    }
}

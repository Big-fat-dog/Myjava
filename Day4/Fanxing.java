package Day4;

import java.util.ArrayList;

public class Fanxing {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        //泛型
        User6 u =new User6();
        P ss = new P();
        l.add(u);
        l.add(ss);

        //从集合里拿到的是obj，也就是泛型
        Object o = l.get(0);
        //转换
        User6 uu = (User6) o ;
        uu.testU();
    }
}
class User6{
    public void testU(){
        System.out.println("user======");
    }
}

class P extends User6{
    public void testp(){
        System.out.println("p======");
    }
}
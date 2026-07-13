package Day4;

import java.util.HashSet;

public class Has {
    public static void main(String[] args) {
        HashSet s = new HashSet<>();
        s.add("z");
        s.add("a");
        s.add("b");
        s.add("z");
        System.out.println(s);

        //无法修改
    }
}

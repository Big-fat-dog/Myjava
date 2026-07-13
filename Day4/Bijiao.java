package Day4;

import java.util.ArrayList;
import java.util.Comparator;

public class Bijiao {
    public static void main(String[] args) {
    ArrayList l = new ArrayList<>();
    //排序
    l.add(3);
    l.add(1);
    l.add(4);
    l.add(2);

    l.sort(new Num());
    System.out.println(l);

 }
}
class Num implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        return o1-o2;
    }
}

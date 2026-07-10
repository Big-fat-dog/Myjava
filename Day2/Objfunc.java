package Day2;

public class Objfunc {
    public static void main(String[] args) {
        Fat s = new Fat();
        s.test("ad","adad");
    }
}
class Fat{
    String aa;
    void test(String... name){
        //接受多个参数
        System.out.println(name);
    }
}
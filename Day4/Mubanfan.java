package Day4;

public class Mubanfan {
    public static void main(String[] args) {
        //泛型不存在多态
        Mban<U> m =new Mban();
        // m.data = new Object()这里只能传U
        m.data = new U();
    }
}

//容器类
class Mban<C>{
    public C data;
}
class U{

}
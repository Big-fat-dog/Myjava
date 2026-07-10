package Day2;

public class Objcet {
    public static void main(String[] args) {
        //Food为引用数据类型
        Food d = new Food();
        d.name = "烧便";
        d.foods = "便便";
        d.execute();
    }
}
class Food{
    //属性
    String name;
    String type="红烧";
    String foods;
    String relish = "大便";


    void execute(){
        System.out.println("洗"+this.foods);
        System.out.println("拉");
        System.out.println("烧"+this.relish);
        System.out.println(this.name+"完成");
    }
}
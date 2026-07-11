package Day3;

//外部类不允许用private，protected修饰，只能默认default或者public
//在源码中直接声明的类叫做外部类
//内部类就是外部里包了
//内部类当作外部类的属性即可
public class Waibulei {
    public static void main(String[] args) {
        
    }
    Outerclass o = new Outerclass();
    Outerclass.Innerclass aa =  o.new Innerclass();//创建内部类
}
class Outerclass{
        //内部类
        public class Innerclass{

        }
    }
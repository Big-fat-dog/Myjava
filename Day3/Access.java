package Day3;

public class Access {
    public static void main(String[] args) {
        /*
        访问权限
        main方法是由jvm调用的，不需要考虑权限。所以要加static，不然jvm还要实例化Access

        1.public：公共的，任意使用
        2.private：只有同一个类中可以使用，连实例都不给用。
        3.（default）：默认的，当不设定任意权限时，jvm会默认提供权限，包（路径）权限（同一个包里面可以用）
        4.protect：在子类内部，可以通过 super.xxx 或 this.xxx 访问父类的 protected 成员
            但：不同包的子类中，不能通过父类的实例访问 protected 成员，只能通过继承关系访问

        */
    
       /*
       这里Access和java.lang.Object属于不同包，跨包只有继承(并且是非静态！静态没有子类上下文，没有this！）或者只在子类内部访问才能访问，比如
       public class Access extends Object{
         void test(String[] args) {
        super.clone();
        Access = new Access;
        Access.clone()  
    }}

    在person跨包，子类内部则可以用

        而如果Access和Object同一个包，则可以不继承，它的main函数里可以随边实例化然后访问protected
       */
       Person1 p = new Person1();
       p.clone();
       //这里是内存的原因，Person1拿到的Object和Access拿到的不是同一个，而Access是最终执行官，所以他无权访问person的clone
    }
}
class Person1{

}
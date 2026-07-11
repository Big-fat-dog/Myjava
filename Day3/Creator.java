package Day3;

public class Creator {
    public static void main(String[] args) {
        Child c1 = new Child("zs");
        Child c2 = new Child("ls");
        Child c3 = new Child("cd");
    }
}
class Father{
    String name;
    Father(String nam){
        this.name =nam;
        System.out.println("000"+this.name);
    }
}
class Child extends Father{
    //子类会默认调用父类的构造方法,如果是无参数的构造方法可以不管，有参数的就得在子类用super()
        Child(String nam){
            super(nam);
            System.out.println("111");
        }
}
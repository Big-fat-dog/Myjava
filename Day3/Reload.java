package Day3;

public class Reload {
    public static void main(String[] args) {
        //函数重载：由参数个数，参数类型，顺序不同做区分,和返回值类型无关！
        //构造函数也存在重载
        User u = new User("adad");
        u.login(222);
        u.login("ahdaoh");
        u.login("aa","bb");
    }
}
class User{
    User(){
        System.out.println("kaka");
    }
    User(String a){
        System.out.println("kaka"+a);
    }
    void login(String account){
        System.out.println(account);
    }
    void login(String num,String pwm){
        System.out.println(num+pwm);
    }
    void login(int a){
        System.out.println(a);
    }
}
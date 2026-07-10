package Day2;

public class FuncArgs {
    public static void main(String[] args) {
        //值传递！在栈里面i,和s是不同的值，i是s的复制体，两个内存地址不同
        // String s = "aaa";
        // String aa = test(s);
        // System.out.println(s);
        // System.out.println(aa);
        //传对象
        User user = new User();
        user.name = "长";
        test(user);
        System.out.println(user.name);
    }
    public static void test(User i){
        i.name +=  20;
    }
}
class User{
    String name;
}
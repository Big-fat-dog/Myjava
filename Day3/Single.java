package Day3;

public class Single {
    // User12 a = new User12();不成功，private不允许构造
    public static void main(String[] args) {
        User12 u = User12.get();
        User12 b = User12.get();
        System.out.println(u==b);
    }
}

class User12{
    private static User12 user12 = null;
    private User12(){
        //创建实例站内存
    }
    public static User12 get(){
        if(user12 == null){
        User12 user12 = new User12();
    }
    return user12;
    }
}
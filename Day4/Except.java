package Day4;

public class Except {

    //异常分为：RuntimeException以及编译异常。
    public static void main(String[] args) throws ArithmeticException{
        //1.ArithemticException算数异常
    try{
        int i = 10;
        int j=i/0;
    }catch(ArithmeticException e){
        e.printStackTrace();
    }
        
    }
    public static void test(){
        test();
    }
}

//自定义异常
class LoginExpect extends RuntimeException{
    public LoginExpect(String message){
        super(message);
    }
}
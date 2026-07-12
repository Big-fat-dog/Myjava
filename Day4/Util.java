package Day4;

public class Util {
    public static void main(String[] args) {
        
    }
}

//属性和方法提供为静态
class StringUtil{
    //非空判断
    public static boolean isEmpry(String str){
        if(str ==null||"".equals(str.trim())){
            return true;
        }
        return false;
    }
}
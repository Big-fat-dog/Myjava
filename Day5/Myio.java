package Day5;

import java.io.File;

public class Myio {
    //数据流操作
    public static void main(String[] args) throws Exception{
        File f = new File("D:\\MyJava\\Day5\\aa.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.getAbsolutePath());
    }
}

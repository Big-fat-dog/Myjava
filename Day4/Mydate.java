package Day4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mydate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//时间戳

        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d);

        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String datefs = sdf.format(d);
        System.out.println(datefs);

        String ss = "2026-07-12";
         // ✅ 添加 try-catch
        try {
            Date dd = sdf.parse(ss);
            System.out.println(dd);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        //日历类
        Calendar a = Calendar.getInstance();
        System.out.println(a.get(Calendar.YEAR));
        System.out.println(a.get(Calendar.DATE));

    }
}

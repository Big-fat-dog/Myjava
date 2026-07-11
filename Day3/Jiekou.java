package Day3;

public interface Jiekou {
    public static void main(String[] args) {
        //基本语法：interface 接口名称{规则属性，规则行为}
        //接口是抽象的
        //规则的属性必须是固定值，且不能修改。属性是静态的，和对象无关
        //行为是抽象的。
        //访问权限是公共的。
        //类需要实现接口，可以有多个接口
        computer aa = new computer();
        light l = new light();
        aa.a = l;
        light l2 = new light();
        aa.b = l2;
        aa.power();
    }
}
interface usb{

}
interface usbp extends usb{
    public void power();
}
interface usbr extends usb{
    public void pwn();
}

class computer implements usbp{
    public usbr a;
    public usbr b;
    public void power(){
        System.out.println("aaa");
        a.pwn();
        b.pwn();
    }
}
class light implements usbr{
    public void pwn(){
        System.out.println("接口");
    };
}
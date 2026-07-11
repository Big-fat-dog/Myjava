package Day3;

public class Enum {
    public static void main(String[] args) {
        System.out.println(City.SHANGHAI.name);
    }
}
enum City{
    BEIJING("背景",111),SHANGHAI("背山花",112);
    City(String name,int code){
        this.name = name;
        this.code = code;
    }
    public String name;
    public int code;

}
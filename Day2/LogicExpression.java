package Day2;

public class LogicExpression {
    public static void main(String[] args) {
        int i = 10;
        boolean result = (i<5) | (i>3);
        System.out.println(result);

        //短路运算符&&
        //会根据第一个条件表达式结果来看是否执行第二个表达式
        int j = 20;
        boolean _result = i>j && i==10;
        System.out.println(_result);

        //短路或运算||:前者为true，则后面的都不执行了，默认返回true
        boolean aresult = (j==20)||(++j==21);
        System.out.println(aresult);
        System.out.println(j);

        //三元运算符
        int k = i==10?22:j;
        System.out.println(k);
    }
}

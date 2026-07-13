package Day5;

import java.util.concurrent.ArrayBlockingQueue;

public class Myqueue {
    public static void main(String[] args) throws Exception{
        //队列:需要容量参数
        ArrayBlockingQueue q = new ArrayBlockingQueue<>(3);

        //add增加满了会报错
        q.add(3);
        // q.add("aa");
        // q.add(33);
        // System.out.println(q);

        //阻塞
        q.put(4);
        System.out.println(1);
        q.put(6);
        System.out.println(2);
        q.offer(7);
        System.out.println(3);
        System.out.println(q.poll());//弹出第一个
        System.out.println(q);
    }
}

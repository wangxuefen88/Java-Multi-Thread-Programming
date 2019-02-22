package firstDemo.IsAlive;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Author: judy
 * @Description: isAlive 表示线程处于什么状态
 * @Date: Created in 9:18 2019/2/22
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        //线程处于什么状态
        System.out.println("run="+this.isAlive());
    }
}

class run{
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin=="+myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end=="+myThread.isAlive());
    }
}

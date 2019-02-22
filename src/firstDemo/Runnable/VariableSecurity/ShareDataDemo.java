package firstDemo.Runnable.VariableSecurity;

import java.io.PipedReader;

/**
 * @Author: judy
 * @Description: 共享数据
 * @Date: Created in 8:03 2019/2/22
 */
public class ShareDataDemo extends Thread {

    private int count = 6;

    /**
     * 1 取得原有i值;
     * 2 计算i-1;
     * 3 对i 进行赋值;
     * 多个线程对统一对象中的同一个实例变量进行操作
     */
    @Override
     synchronized public void run() {
        super.run();
        count--;
        System.out.println(this.currentThread().getName()+"计算count is="+count);
    }
    public static void main(String[] args){
       ShareDataDemo shareDataDemo = new ShareDataDemo();
       Thread thread1= new Thread(shareDataDemo,"1");
       Thread thread2= new Thread(shareDataDemo,"2");
       Thread thread3= new Thread(shareDataDemo,"3");
       Thread thread4= new Thread(shareDataDemo,"4");
       Thread thread5= new Thread(shareDataDemo,"5");
       Thread thread6= new Thread(shareDataDemo,"6");
       thread1.start();
       thread2.start();
       thread3.start();
       thread4.start();
       thread5.start();
       thread6.start();
    }

}

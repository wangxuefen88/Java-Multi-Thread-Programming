package firstDemo.MyThread;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 23:16 2019/2/21
 */
public class myThreadTwoDemo extends Thread {
    @Override
    public void run() {
        super.run();
            for (int i = 0; i < 10; i++) {
                int time =(int)(Math.random()*1000);
                try {
                    Thread.sleep(time);
                    System.out.println("run="+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public static void main(String[] args) throws InterruptedException {
    myThreadTwoDemo  mythreadtwo = new myThreadTwoDemo();
        mythreadtwo.setName("mythreadtwo");
        //表示该线程准备就绪.等待run方法调用
        mythreadtwo.start();
        for (int i = 0; i < 10; i++) {
        int time = (int) Math.random()*1000;
        Thread.sleep(time);
            System.out.println("main="+Thread.currentThread().getName());
        }
    }
}

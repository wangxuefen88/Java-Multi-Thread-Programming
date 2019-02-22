package firstDemo.useReturnInterrupt;

/**
 * @Author: judy
 * @Description: interrupt与 return结合使用
 * @Date: Created in 10:38 2019/2/22
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了!");
                return;
            }
            System.out.println("time"+System.currentTimeMillis());
        }
    }
}

class Run{
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(5000);
        myThread.interrupt();
    }
}

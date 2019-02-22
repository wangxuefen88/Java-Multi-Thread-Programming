package firstDemo.Intreeupted;

/**
 * @Author: judy
 * @Description: 中断线程, interrupt--interrupted 自带清理功能,第一次的中断状态已经被清除,所以第二次就是true
 * @Date: Created in 9:52 2019/2/22
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <50000 ; i++) {
            System.out.println("i="+(i+1));
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        //start异步
//        myThread.start();
//        Thread.sleep(5000);
//        //interrupt表示中断
//        Thread.currentThread().interrupt();

        Thread thread = new Thread();
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
        System.out.println("查看当前线程是否中断-1-"+thread.isInterrupted());
        System.out.println("查看当前线程是否中断-2-"+thread.isInterrupted());
        System.out.println("end");
    }
}

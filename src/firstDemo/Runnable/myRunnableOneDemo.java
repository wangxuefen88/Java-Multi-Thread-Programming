package firstDemo.Runnable;

/**
 * @Author: judy
 * @Description: run运行,展示Thread的构造函数可以使用runable, 以及为什么使用runnable ,
 * @Date: Created in 23:39 2019/2/21
 */
public class myRunnableOneDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("运行中");
    }
    public static void main(String[] args){
        Runnable runnable= new myRunnableOneDemo();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}

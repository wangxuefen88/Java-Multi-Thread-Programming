package firstDemo.CurrentThread;

/**
 * @Author: judy
 * @Description: run 方法是main方法调用和start方法是线程调用的 ,run表示的同步进行, start表示异步进行
 * @Date: Created in 8:59 2019/2/22
 */
public class CurrentThreadDemo extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("this is run="+currentThread().getName());
    }
    public CurrentThreadDemo(){
        System.out.println("this is 构造方法="+currentThread().getName());
    }
    public static void main(String[] args){
        CurrentThreadDemo currentThreadDemo = new CurrentThreadDemo();
        currentThreadDemo.start();
    }
}

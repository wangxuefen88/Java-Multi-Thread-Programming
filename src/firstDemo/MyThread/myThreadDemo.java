package firstDemo.MyThread;

/**

 * @Author: judy
 * @Description:
 * @Date: Created in 23:07 2019/2/21
 */
public class myThreadDemo extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("this is first demo");
    }
    public static void main(String[] args){
        myThreadDemo myThreadDemo =new myThreadDemo();
        myThreadDemo.start();
        System.out.println("maybe should end");

    }
}

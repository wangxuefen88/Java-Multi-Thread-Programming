package firstDemo.Daemon;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 11:06 2019/2/22
 */
public class DaemonDemo extends Thread {
    private int count = 0;

    @Override
    public void run() {
        super.run();
        while (true){
            count++;
            System.out.println("count="+(count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Run{
    public static void main(String[] args) throws InterruptedException {
        DaemonDemo daemonDemo = new DaemonDemo();
        daemonDemo.setDaemon(true);
        daemonDemo.start();
        Thread.sleep(1000);
        System.out.println("end");
    }


 }

package firstDemo.Yield;

/**

 * @Author: judy
 * @Description: yield biaoshi
 * @Date: Created in 10:50 2019/2/22
 */
public class YieldDemo extends Thread {
    @Override
    public void run() {
        long timeStart = System.currentTimeMillis();
        int count =0;
        for (int i = 0; i < 500000; i++) {
            // 测试使用yield和不使用的时间差
           // Thread.yield();
            count=count+(i+1);
        }
        long timeEnd= System.currentTimeMillis();
        System.out.println("总共用时="+ (timeEnd-timeStart));
        super.run();
    }
    public static void main(String[] args){
     YieldDemo yieldDemo = new YieldDemo();
     yieldDemo.start();
    }
}

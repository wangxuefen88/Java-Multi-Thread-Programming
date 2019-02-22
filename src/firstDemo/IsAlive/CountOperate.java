package firstDemo.IsAlive;

import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;

/**
 * @Author: judy
 * @Description: this 与 currentThread的区别
 * @Date: Created in 9:26 2019/2/22
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("countoperate---begin");
        System.out.println("thread coutoperate.getname="+Thread.currentThread().getName());
        System.out.println("thread coutoperate.isAlive="+Thread.currentThread().isAlive());
        System.out.println("this---begin");
        System.out.println("this.getname="+this.getName());
        System.out.println("this.isAlive="+this.isAlive());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run---begin");
        System.out.println("thread coutoperate.getname="+Thread.currentThread().getName());
        System.out.println("thread coutoperate.isAlive="+Thread.currentThread().isAlive());
        System.out.println("this.getname="+this.getName());
        System.out.println("this.isAlive="+this.isAlive());
        System.out.println("this---end");
    }
    public static void main(String[] args){
     CountOperate countOperate = new CountOperate();
     Thread t1 = new Thread(countOperate);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());
    }
}

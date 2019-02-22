package firstDemo.MyThread;

import javax.xml.bind.SchemaOutputResolver;

/** ex
 * @Author: judy
 * @Description: start的顺序不代表线程运行的顺序
 * @Date: Created in 23:28 2019/2/21
 */
public class myThreadThreeDemo extends Thread {
    private int i;
    public myThreadThreeDemo(int i){
        this.i=i;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
    public static void main(String[] args){
        myThreadThreeDemo myThreadThreeDemo1 = new myThreadThreeDemo(1);
        myThreadThreeDemo myThreadThreeDemo2 = new myThreadThreeDemo(2);
        myThreadThreeDemo myThreadThreeDemo3 = new myThreadThreeDemo(3);
        myThreadThreeDemo myThreadThreeDemo4 = new myThreadThreeDemo(4);
        myThreadThreeDemo myThreadThreeDemo5 = new myThreadThreeDemo(5);
        myThreadThreeDemo myThreadThreeDemo6 = new myThreadThreeDemo(6);
        myThreadThreeDemo myThreadThreeDemo7 = new myThreadThreeDemo(7);
        myThreadThreeDemo myThreadThreeDemo8 = new myThreadThreeDemo(8);
        myThreadThreeDemo myThreadThreeDemo9 = new myThreadThreeDemo(9);
        myThreadThreeDemo myThreadThreeDemo10 = new myThreadThreeDemo(10);
        myThreadThreeDemo myThreadThreeDemo11 = new myThreadThreeDemo(11);
        myThreadThreeDemo myThreadThreeDemo12= new myThreadThreeDemo(12);
        myThreadThreeDemo myThreadThreeDemo13 = new myThreadThreeDemo(13);
        myThreadThreeDemo myThreadThreeDemo14 = new myThreadThreeDemo(14);
        myThreadThreeDemo myThreadThreeDemo15 = new myThreadThreeDemo(15);
        myThreadThreeDemo myThreadThreeDemo16 = new myThreadThreeDemo(16);
        myThreadThreeDemo1.start();
        myThreadThreeDemo2.start();
        myThreadThreeDemo3.start();
        myThreadThreeDemo4.start();
        myThreadThreeDemo5.start();
        myThreadThreeDemo6.start();
        myThreadThreeDemo7.start();
        myThreadThreeDemo8.start();
        myThreadThreeDemo9.start();
        myThreadThreeDemo10.start();
        myThreadThreeDemo11.start();
        myThreadThreeDemo12.start();
        myThreadThreeDemo13.start();
        myThreadThreeDemo14.start();
        myThreadThreeDemo15.start();
        myThreadThreeDemo16.start();
    }
}

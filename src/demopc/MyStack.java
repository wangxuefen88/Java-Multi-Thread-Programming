package demopc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 7:01 2019/3/13
 */
public class MyStack {
    private List list = new ArrayList();
   synchronized   public void push() throws InterruptedException {
       int[] number = new int[64];
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            while (i==64){
                notify();
                wait();
                i=0;
                list= new ArrayList();
            }
            number[i] = (int) (Math.random() * 10);
            list.add(number[i]);
        }
    }
    synchronized  public void pop() throws InterruptedException {
       while (list!=null && list.size()>0){
            System.out.println("消费者"+list.size()+Thread.currentThread().getName()+list.get(0).toString());
            list.remove(0);
           if (list.size()==0){
               notifyAll();
           }
           while (list.size()==0){
               System.out.println("消费者等待消费");
               wait();
           }
        }


    }
}

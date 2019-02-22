package firstDemo.GetId;

/**
 * @Author: judy
 * @Description: 从线程中得出getid
 * @Date: Created in 9:38 2019/2/22
 */
public class GetIdDemo {
    public static void main(String[] args){
      Thread thread = Thread.currentThread();
      //指出currentThread和Thread的区别,current输出的getname是main线程, thread()输出的线程threa0线程
        Thread thread1 = new Thread();
        System.out.println( thread.getName()+thread.getId());
    }
}

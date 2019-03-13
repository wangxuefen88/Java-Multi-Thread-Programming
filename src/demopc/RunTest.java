package demopc;

/**
 * @Author: judy
 * @Description: 1个生产者多个消费者
 * @Date: Created in 7:20 2019/3/13
 */
public class RunTest{
    public static void main(String[] args){
        MyStack myStack = new MyStack();
        P1 p1 = new P1(myStack);
        ThreadP threadP = new ThreadP(p1);
        threadP.start();
        for (int i = 0; i < 64; i++) {
            C1 c1=new C1(myStack);
            ThreadC threadC = new ThreadC(c1);
            threadC.start();
        }
    }
}

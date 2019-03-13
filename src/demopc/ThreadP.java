package demopc;

/**
 * @param user
 * @Author: judy
 * @Description:
 * @Date: Created in 6:53 2019/3/13
 */
/**
 * 生产者线程
 */
public class ThreadP extends Thread{
    private P1 p1;
    public ThreadP (P1 p1){
        super();
        this.p1=p1;
    }

    @Override
    public void run() {
        try {
            p1.setValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/**
 * 消费者线程
 */
class ThreadC extends Thread{
    private C1 c1;
    public ThreadC (C1 c1){
        super();
        this.c1=c1;
    }

    @Override
    public void run() {
        try {
            c1.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 生产者
 */
class P1{
    private MyStack myStack;
    public P1(MyStack myStack){
        super();
        this.myStack=myStack;
    }
    public void setValue() throws InterruptedException {
        myStack.push();
    }
}
/**
 * 消费者
 */
class C1{
    private MyStack myStack;
    public C1(MyStack myStack){
        super();
        this.myStack=myStack;
    }
    public void getValue() throws InterruptedException {
        myStack.pop();
    }
}

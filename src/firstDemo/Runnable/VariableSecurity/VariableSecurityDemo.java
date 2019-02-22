package firstDemo.Runnable.VariableSecurity;

/**
 * @Author: judy
 * @Description: 不共享变量(数据的情况)
 *
 * @Date: Created in 7:55 2019/2/22
 */
public class VariableSecurityDemo extends  Thread{
    private int count =5;

    public VariableSecurityDemo(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算count is value"+count);
        }
    }

    public static void main(String[] args){
        //每个线程自己有一个count,不共享,所以数据都是安全的
        VariableSecurityDemo variableSecurityDemo1= new VariableSecurityDemo("A");
        VariableSecurityDemo variableSecurityDemo2= new VariableSecurityDemo("B");
        VariableSecurityDemo variableSecurityDemo3= new VariableSecurityDemo("C");
        VariableSecurityDemo variableSecurityDemo4= new VariableSecurityDemo("D");
        variableSecurityDemo1.start();
        variableSecurityDemo2.start();
        variableSecurityDemo3.start();
        variableSecurityDemo4.start();
    }
}

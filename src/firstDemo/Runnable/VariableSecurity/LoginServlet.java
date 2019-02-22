package firstDemo.Runnable.VariableSecurity;

/**
 * @Author: judy
 * @Description: 模拟线程不安全,有问题待商量
 * @Date: Created in 8:38 2019/2/22
 */
public class LoginServlet {
    private static String username;
    private static String password;

    public static void doPost(String username, String password) throws InterruptedException {
        username = username;
        if (username.equals("a")) {
            Thread.sleep(5);
        }
        password = password;
        System.out.println("username=" + username + "password=" + password);
    }
}
//    println本身就是线程安全的
//    public void println(String x) {
//        synchronized (this) {
//            print(x);
//            newLine();
//        }
//    }
class Alogin extends Thread {
    @Override
    public void run() {
        try {
            LoginServlet.doPost("a", "aa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Blogin extends Thread {
    @Override
    public void run() {
        try {
            LoginServlet.doPost("b", "bb");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Run {
    public static void main(String[] args) {
        Alogin alogin = new Alogin();
        alogin.start();
        Blogin blogin = new Blogin();
        blogin.start();
    }
}


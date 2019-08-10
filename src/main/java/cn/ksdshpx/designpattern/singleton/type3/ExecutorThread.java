package cn.ksdshpx.designpattern.singleton.type3;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/9
 * Time: 12:45
 * Description:执行线程
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}

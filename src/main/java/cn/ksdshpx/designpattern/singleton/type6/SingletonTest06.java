package cn.ksdshpx.designpattern.singleton.type6;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/4
 * Time: 21:59
 * Description:单例设计模式（静态内部类实现）
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singleton {
    private Singleton() {

    }

    private static class SinletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SinletonInstance.INSTANCE;
    }
}

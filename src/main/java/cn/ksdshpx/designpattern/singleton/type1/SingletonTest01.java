package cn.ksdshpx.designpattern.singleton.type1;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/4
 * Time: 13:38
 * Description:单例设计模式（饿汉式-静态常量）
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);//true
    }
}

class Singleton {
    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

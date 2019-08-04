package cn.ksdshpx.designpattern.singleton.type3;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/4
 * Time: 20:12
 * Description:单例设计模式（懒汉式-线程不安全）
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);//true
    }
}

class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

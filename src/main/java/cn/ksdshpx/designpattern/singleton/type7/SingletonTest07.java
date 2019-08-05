package cn.ksdshpx.designpattern.singleton.type7;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/5
 * Time: 11:04
 * Description:单例设计模式（枚举实现）
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
    }
}

enum Singleton {
    INSTANCE;
}

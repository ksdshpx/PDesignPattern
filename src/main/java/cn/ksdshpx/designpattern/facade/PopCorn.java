package cn.ksdshpx.designpattern.facade;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/10
 * Time: 15:37
 * Description:爆米花机
 */
public class PopCorn {
    private PopCorn(){}

    private static final PopCorn instance = new PopCorn();

    public static PopCorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("PopCorn on...");
    }

    public void pop(){
        System.out.println("PopCorn pop...");
    }

    public void off(){
        System.out.println("PopCorn off...");
    }
}

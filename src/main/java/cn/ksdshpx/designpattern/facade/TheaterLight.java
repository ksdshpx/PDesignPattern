package cn.ksdshpx.designpattern.facade;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/11
 * Time: 9:42
 * Description:影院灯光
 */
public class TheaterLight {
    private TheaterLight(){}

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on...");
    }

    public void bright(){
        System.out.println("TheaterLight bright...");
    }

    public void dim(){
        System.out.println("TheaterLight dim...");
    }

    public void off(){
        System.out.println("TheaterLight off...");
    }
}

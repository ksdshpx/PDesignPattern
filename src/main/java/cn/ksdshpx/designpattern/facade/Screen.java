package cn.ksdshpx.designpattern.facade;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/11
 * Time: 9:36
 * Description:屏幕
 */
public class Screen {
    private Screen(){}

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen up...");
    }

    public void down(){
        System.out.println("Screen down...");
    }
}

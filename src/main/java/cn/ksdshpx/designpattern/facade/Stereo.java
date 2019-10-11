package cn.ksdshpx.designpattern.facade;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/11
 * Time: 9:38
 * Description:立体声
 */
public class Stereo {
    private Stereo(){}

    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo on...");
    }

    public void up(){
        System.out.println("Stereo up...");
    }

    public void off(){
        System.out.println("Stereo off...");
    }
}

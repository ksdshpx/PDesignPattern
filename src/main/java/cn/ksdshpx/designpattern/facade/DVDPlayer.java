package cn.ksdshpx.designpattern.facade;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/10
 * Time: 15:22
 * Description:DVD播放器
 */
public class DVDPlayer {
    private DVDPlayer(){}

    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD on...");
    }

    public void paly(){
        System.out.println("DVD is playing...");
    }

    public void pause(){
        System.out.println("DVD pause...");
    }

    public void off(){
        System.out.println("DVD off...");
    }
}

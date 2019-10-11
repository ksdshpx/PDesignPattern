package cn.ksdshpx.designpattern.facade;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/10
 * Time: 16:28
 * Description:投影仪
 */
public class Projector {
    private Projector(){}

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on...");
    }

    public void focus(){
        System.out.println("Projector focus...");
    }

    public void off(){
        System.out.println("Projector off...");
    }
}

package cn.ksdshpx.designpattern.command;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/10/26
 * Time: 21:44
 * Description:电灯接收者
 */
public class LightReceiver {
    public void on() {
        System.out.println("电灯打开！");
    }

    public void off() {
        System.out.println("电灯关闭！");
    }
}

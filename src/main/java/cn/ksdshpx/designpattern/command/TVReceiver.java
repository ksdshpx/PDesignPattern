package cn.ksdshpx.designpattern.command;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/10/27
 * Time: 20:39
 * Description:电视机接收者
 */
public class TVReceiver {
    public void on() {
        System.out.println("电视机打开！");
    }

    public void off() {
        System.out.println("电视机关闭！");
    }
}

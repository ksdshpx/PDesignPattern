package cn.ksdshpx.designpattern.command;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/10/27
 * Time: 18:49
 * Description:客户端
 */
public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("------------按下灯的开按钮-------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("------------按下灯的关按钮-------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("------------按下灯的撤销按钮-------------");
        remoteController.undoButtonWasPushed();
        System.out.println("---------------------");
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("------------按下电视机的开按钮-------------");
        remoteController.onButtonWasPushed(1);
        System.out.println("------------按下电视机的关按钮-------------");
        remoteController.offButtonWasPushed(1);
        System.out.println("------------按下电视机的撤销按钮-------------");
        remoteController.undoButtonWasPushed();
    }
}

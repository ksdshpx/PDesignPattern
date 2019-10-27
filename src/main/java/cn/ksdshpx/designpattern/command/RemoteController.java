package cn.ksdshpx.designpattern.command;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/10/27
 * Time: 17:40
 * Description:遥控器
 */
public class RemoteController {
    //开按钮的命令数组
    Command[] offCommands;
    //关按钮的命令数组
    Command[] onCommands;
    //执行撤销的命令数组
    Command undoCommand;

    //构造器，完成按钮的初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置我们需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开的按钮
    public void onButtonWasPushed(int no) {
        //找到按下的开的按钮并调用对应的方法
        onCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下关的按钮
    public void offButtonWasPushed(int no) {
        //找到按下的关的按钮并调用对应的方法
        offCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    //按下撤销的按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}

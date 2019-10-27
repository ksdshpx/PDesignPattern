package cn.ksdshpx.designpattern.command;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/10/26
 * Time: 21:43
 * Description:电灯打开
 */
public class LightOnCommand implements Command {
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}

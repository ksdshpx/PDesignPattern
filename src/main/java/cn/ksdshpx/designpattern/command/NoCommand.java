package cn.ksdshpx.designpattern.command;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/10/26
 * Time: 21:47
 * Description:空操作
 *      用于初始化每个按钮，当调用空命令时，对象什么都不做，
 *      这其实也是一种设计模式，可以省去空判断
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

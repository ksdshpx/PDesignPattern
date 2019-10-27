package cn.ksdshpx.designpattern.command;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/10/26
 * Time: 21:42
 * Description:命令接口
 */
public interface Command {
    void execute();

    void undo();
}

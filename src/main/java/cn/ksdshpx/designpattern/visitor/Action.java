package cn.ksdshpx.designpattern.visitor;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/11/2
 * Time: 20:04
 * Description:歌手评价（访问者）
 */
public abstract class Action {
    //男性测评
    public abstract void getManResult(Man man);

    //女性测评
    public abstract void getWomanResult(Woman woman);
}

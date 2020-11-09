package cn.ksdshpx.designpattern.visitor;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/11/2
 * Time: 20:04
 * Description:男性观众
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}

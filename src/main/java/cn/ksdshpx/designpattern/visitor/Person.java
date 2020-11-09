package cn.ksdshpx.designpattern.visitor;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/11/2
 * Time: 20:03
 * Description:观众类（Element）
 */
public abstract class Person {
    //提供一个方法让访问者可以访问
    public abstract void accept(Action action);
}

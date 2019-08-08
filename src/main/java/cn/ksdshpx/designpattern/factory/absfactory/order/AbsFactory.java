package cn.ksdshpx.designpattern.factory.absfactory.order;

import cn.ksdshpx.designpattern.factory.absfactory.pizza.Pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/8
 * Time: 14:54
 * Description:抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {
    Pizza createPizza(String orderType);
}

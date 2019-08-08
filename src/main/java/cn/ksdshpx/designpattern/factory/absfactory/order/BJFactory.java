package cn.ksdshpx.designpattern.factory.absfactory.order;

import cn.ksdshpx.designpattern.factory.absfactory.pizza.BJCheesePizza;
import cn.ksdshpx.designpattern.factory.absfactory.pizza.BJPepperPizza;
import cn.ksdshpx.designpattern.factory.absfactory.pizza.Pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/8
 * Time: 14:56
 * Description:北京工厂
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}

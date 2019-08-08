package cn.ksdshpx.designpattern.factory.absfactory.order;

import cn.ksdshpx.designpattern.factory.absfactory.pizza.LDCheesePizza;
import cn.ksdshpx.designpattern.factory.absfactory.pizza.LDPepperPizza;
import cn.ksdshpx.designpattern.factory.absfactory.pizza.Pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/8
 * Time: 14:58
 * Description:伦敦工厂
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

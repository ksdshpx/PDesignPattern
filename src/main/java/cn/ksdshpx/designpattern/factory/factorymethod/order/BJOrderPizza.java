package cn.ksdshpx.designpattern.factory.factorymethod.order;

import cn.ksdshpx.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import cn.ksdshpx.designpattern.factory.factorymethod.pizza.BJPepperPizza;
import cn.ksdshpx.designpattern.factory.factorymethod.pizza.Pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/8
 * Time: 10:13
 * Description:BJOrderPizza类
 */
public class BJOrderPizza extends OrderPizza {
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

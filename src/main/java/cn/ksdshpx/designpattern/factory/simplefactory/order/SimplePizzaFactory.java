package cn.ksdshpx.designpattern.factory.simplefactory.order;

import cn.ksdshpx.designpattern.factory.simplefactory.pizza.CheesePizza;
import cn.ksdshpx.designpattern.factory.simplefactory.pizza.GreekPizza;
import cn.ksdshpx.designpattern.factory.simplefactory.pizza.PepperPizza;
import cn.ksdshpx.designpattern.factory.simplefactory.pizza.Pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/6
 * Time: 10:05
 * Description:简单工厂模式的工厂类
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if("cheese".equals(type)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if("pepper".equals(type)){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}

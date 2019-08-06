package cn.ksdshpx.designpattern.factory.simplefactory.order;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/5
 * Time: 16:11
 * Description:相当于一个客户端，发出Pizza订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();
        new OrderPizza(new SimplePizzaFactory());
    }
}

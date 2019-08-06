package cn.ksdshpx.designpattern.factory.simplefactory.order;

import cn.ksdshpx.designpattern.factory.simplefactory.pizza.GreekPizza;
import cn.ksdshpx.designpattern.factory.simplefactory.pizza.PepperPizza;
import cn.ksdshpx.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/5
 * Time: 16:02
 * Description:订购Pizza类
 */
public class OrderPizza {
    private SimplePizzaFactory simplePizzaFactory;
    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
        setFactory(simplePizzaFactory);
        /*Pizza pizza = null;
        String orderType;//订购Pizza的类型
        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("奶酪披萨");
            } else if("pepper".equals(orderType)){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            } else {
                break;
            }
            //输出Pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);*/
    }

    public void setFactory(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
        Pizza pizza = null;
        String orderType;//订购Pizza的类型
        do {
            orderType = getType();
            pizza = this.simplePizzaFactory.createPizza(orderType);
            //输出Pizza制作过程
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("披萨订购失败..");
                break;
            }
        } while (true);
    }

    private String getType() {
        BufferedReader bufferedReader = null;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入订购的Pizza种类:");
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}

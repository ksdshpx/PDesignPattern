package cn.ksdshpx.designpattern.factory.factorymethod.order;

import cn.ksdshpx.designpattern.factory.factorymethod.pizza.Pizza;

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
public abstract class OrderPizza {
    //定义一个抽象方法，让各个工厂子类去实现
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购Pizza的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            //输出Pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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

package cn.ksdshpx.designpattern.factory.simplefactory.pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/5
 * Time: 15:51
 * Description:CheesePizza类
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪Pizza准备原材料");
    }
}

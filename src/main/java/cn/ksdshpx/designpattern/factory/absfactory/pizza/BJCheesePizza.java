package cn.ksdshpx.designpattern.factory.absfactory.pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/8
 * Time: 10:01
 * Description:BJCheesePizza类
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("为北京的奶酪披萨准备原材料");
    }
}

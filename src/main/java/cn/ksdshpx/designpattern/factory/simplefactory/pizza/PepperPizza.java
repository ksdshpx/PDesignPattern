package cn.ksdshpx.designpattern.factory.simplefactory.pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/5
 * Time: 16:21
 * Description:PepperPizza类
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("为制作胡椒披萨准备原材料");
    }
}

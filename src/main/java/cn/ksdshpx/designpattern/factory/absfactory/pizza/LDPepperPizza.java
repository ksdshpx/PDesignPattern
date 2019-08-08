package cn.ksdshpx.designpattern.factory.absfactory.pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/8
 * Time: 10:05
 * Description:LDPepperPizza披萨
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("为制作伦敦的奶酪披萨准备原材料");
    }
}

package cn.ksdshpx.designpattern.factory.absfactory.pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/8
 * Time: 10:03
 * Description:BJPepperPizza类
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println("为制作北京的胡椒披萨准备原材料");
    }
}

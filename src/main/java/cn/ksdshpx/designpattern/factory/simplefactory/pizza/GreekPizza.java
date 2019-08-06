package cn.ksdshpx.designpattern.factory.simplefactory.pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/5
 * Time: 15:51
 * Description:GreekPizza类
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作希腊Pizza准备原材料");
    }
}

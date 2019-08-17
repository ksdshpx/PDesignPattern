package cn.ksdshpx.designpattern.decorator;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/17
 * Time: 12:40
 * Description:咖啡类
 */
public class Coffee extends Drink {
    @Override
    public Float cost() {
        return super.getPrice();
    }
}

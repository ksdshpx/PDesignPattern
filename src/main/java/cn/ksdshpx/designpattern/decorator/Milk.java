package cn.ksdshpx.designpattern.decorator;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/17
 * Time: 12:47
 * Description:牛奶调味品
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(2.0F);
    }
}

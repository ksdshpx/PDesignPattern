package cn.ksdshpx.designpattern.decorator;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/17
 * Time: 12:49
 * Description:巧克力调味品
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(1.0F);
    }
}

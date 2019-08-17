package cn.ksdshpx.designpattern.decorator;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/17
 * Time: 12:43
 * Description:装饰器类（是你还有你，一切拜托你）
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }


    @Override
    public Float cost() {
        return super.getPrice() + drink.cost();
    }
}

package cn.ksdshpx.designpattern.decorator;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/17
 * Time: 11:43
 * Description:被装饰的类
 */
public abstract class Drink {
    private String desc;
    private Float price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public abstract Float cost();
}

package cn.ksdshpx.designpattern.builder.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 13:25
 * Description:创建房子产品的抽象类
 */
public abstract class AbstractHouseBuilder {
    private House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House getHouse() {
        return house;
    }
}

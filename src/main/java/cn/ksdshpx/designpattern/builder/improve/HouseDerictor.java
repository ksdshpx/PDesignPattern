package cn.ksdshpx.designpattern.builder.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 13:31
 * Description:造房子的指挥者
 */
public class HouseDerictor {
    private AbstractHouseBuilder houseBuilder;

    public HouseDerictor(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.getHouse();
    }
}

package cn.ksdshpx.designpattern.builder.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 13:30
 * Description:别墅的建造
 */
public class VillaHouseBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("别墅打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("别墅砌墙...");
    }

    @Override
    public void roofed() {
        System.out.println("别墅盖屋顶...");
    }
}

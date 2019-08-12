package cn.ksdshpx.designpattern.builder.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 13:28
 * Description:普通房子的建造
 */
public class CommonHouseBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙...");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶...");
    }
}

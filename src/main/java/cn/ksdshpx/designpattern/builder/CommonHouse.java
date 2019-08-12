package cn.ksdshpx.designpattern.builder;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 9:38
 * Description:普通房子
 */
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙...");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶...");
    }
}

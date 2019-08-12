package cn.ksdshpx.designpattern.builder;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 9:35
 * Description:抽象房子类
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}

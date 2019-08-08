package cn.ksdshpx.designpattern.factory.factorymethod.pizza;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/5
 * Time: 15:47
 * Description:披萨抽象类
 */
public abstract class Pizza {
    protected String name;

    //准备原材料，不同的Pizza是不一样的
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cuting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

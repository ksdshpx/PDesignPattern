package cn.ksdshpx.designpattern.composite;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/9
 * Time: 16:51
 * Description:组合设计模式（Component)
 */
public abstract class Organization {
    private String name;
    private String desc;

    public Organization() {
    }

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void add(Organization organization) {

    }

    public void remove(Organization organization) {

    }

    public abstract void print();

}

package cn.ksdshpx.designpattern.composite;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/9
 * Time: 18:15
 * Description:系
 */
public class Department extends Organization{
    public Department() {
    }

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(getName()+"---"+getDesc());
    }
}

package cn.ksdshpx.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/9
 * Time: 16:58
 * Description:学院类
 */
public class College extends Organization {
    private List<Organization> departments = new ArrayList<>();

    public College() {
    }

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Organization organization) {
        departments.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        departments.remove(organization);
    }

    @Override
    public void print() {
        System.out.println(getName() + "---" + getDesc());
        for (Organization department : departments) {
            department.print();
        }
    }
}

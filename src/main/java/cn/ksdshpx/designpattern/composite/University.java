package cn.ksdshpx.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/9
 * Time: 16:53
 * Description:大学类
 */
public class University extends Organization {
    private List<Organization> colleges = new ArrayList<>();

    public University() {
    }


    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Organization organization) {
        colleges.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        colleges.remove(organization);
    }

    @Override
    public void print() {
        System.out.println(getName() + "---" + getDesc());
        for (Organization college : colleges) {
            college.print();
        }
    }
}

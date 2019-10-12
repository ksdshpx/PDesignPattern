package cn.ksdshpx.designpattern.flyweight;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/12
 * Time: 13:08
 * Description:外部对象
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

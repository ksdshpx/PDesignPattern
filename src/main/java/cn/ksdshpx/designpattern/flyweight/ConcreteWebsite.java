package cn.ksdshpx.designpattern.flyweight;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/12
 * Time: 13:09
 * Description:具体的享元类
 */
public class ConcreteWebsite extends WebSite {
    //内部对象
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站以" + type + "的形式发布，当前" + user.getName() + "正在使用！");
    }
}

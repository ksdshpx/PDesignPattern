package cn.ksdshpx.designpattern.flyweight;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/12
 * Time: 13:19
 * Description:客户端调用
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory websitePool = WebsiteFactory.getInstance();
        ConcreteWebsite website1 = websitePool.getConcreteWebsite("新闻");
        website1.use(new User("张三"));
        ConcreteWebsite website2 = websitePool.getConcreteWebsite("新闻");
        website2.use(new User("李四"));
        System.out.println("网站个数："+websitePool.getWebsitePoolSize());
        ConcreteWebsite website3 = websitePool.getConcreteWebsite("博客");
        website2.use(new User("王五"));
        System.out.println("网站个数："+websitePool.getWebsitePoolSize());
        ConcreteWebsite website4 = websitePool.getConcreteWebsite("博客");
        website2.use(new User("赵六"));
        System.out.println("网站个数："+websitePool.getWebsitePoolSize());
    }
}

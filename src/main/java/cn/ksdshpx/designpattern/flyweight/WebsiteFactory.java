package cn.ksdshpx.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/12
 * Time: 13:12
 * Description:享元工厂类
 */
public class WebsiteFactory {
    private WebsiteFactory() {
    }

    private static final WebsiteFactory webSiteFactory = new WebsiteFactory();

    private Map<String, ConcreteWebsite> websitePool = new HashMap<>();

    public static WebsiteFactory getInstance() {
        return webSiteFactory;
    }

    public ConcreteWebsite getConcreteWebsite(String type) {
        if (!websitePool.containsKey(type)) {
            websitePool.put(type, new ConcreteWebsite(type));
        }
        return websitePool.get(type);
    }

    public Integer getWebsitePoolSize() {
        return websitePool.size();
    }
}

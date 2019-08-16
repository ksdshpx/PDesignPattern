package cn.ksdshpx.designpattern.proxy.dynamicproxy.cglib;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/16
 * Time: 14:52
 * Description:客户端调用
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxy = (ITeacherDao) new ProxyFactory(target).getProxy();
        proxy.teach();
    }
}

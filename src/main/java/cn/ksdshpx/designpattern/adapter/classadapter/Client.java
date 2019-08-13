package cn.ksdshpx.designpattern.adapter.classadapter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/13
 * Time: 10:30
 * Description:客户端
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}

package cn.ksdshpx.designpattern.bridge;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/14
 * Time: 10:21
 * Description:客户端调用
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Xiaomi());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("==========================");
        phone = new FoldedPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("===========================");
        phone = new UpRightPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
    }
}

package cn.ksdshpx.designpattern.bridge;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/14
 * Time: 10:14
 * Description:折叠式手机
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠式手机...");
    }

    public void call() {
        super.call();
        System.out.println("折叠式手机...");
    }

    public void close() {
        super.close();
        System.out.println("折叠式手机...");
    }
}

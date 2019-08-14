package cn.ksdshpx.designpattern.bridge;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/14
 * Time: 10:12
 * Description:抽象手机类
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void call() {
        this.brand.call();
    }

    protected void close() {
        this.brand.close();
    }
}

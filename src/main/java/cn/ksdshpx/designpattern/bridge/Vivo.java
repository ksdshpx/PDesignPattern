package cn.ksdshpx.designpattern.bridge;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/14
 * Time: 10:11
 * Description:Vivo品牌
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo手机开机...");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话...");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机...");
    }
}

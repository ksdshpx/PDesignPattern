package cn.ksdshpx.designpattern.builder;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 9:39
 * Description:客户端调用
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse house = new CommonHouse();
        house.build();
    }
}

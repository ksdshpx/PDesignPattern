package cn.ksdshpx.designpattern.adapter.classadapter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/13
 * Time: 10:29
 * Description:手机类
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5v() == 5) {
            System.out.println("电压为5V,可以充电");
        } else {
            System.out.println("电压不是5V,不可以充电");
        }
    }
}

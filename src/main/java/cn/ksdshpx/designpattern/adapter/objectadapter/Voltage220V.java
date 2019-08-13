package cn.ksdshpx.designpattern.adapter.objectadapter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/13
 * Time: 10:25
 * Description:被适配的类
 */
public class Voltage220V {
    public int output220v() {
        int srcV = 220;
        return srcV;
    }
}

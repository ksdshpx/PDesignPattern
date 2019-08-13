package cn.ksdshpx.designpattern.adapter.classadapter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/13
 * Time: 10:27
 * Description:适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5v() {
        int srcV = output220v();
        //转换为5V
        int dstV = srcV / 44;
        return dstV;
    }
}

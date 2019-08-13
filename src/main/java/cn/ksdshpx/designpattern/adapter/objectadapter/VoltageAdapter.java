package cn.ksdshpx.designpattern.adapter.objectadapter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/13
 * Time: 10:27
 * Description:适配器类
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        int dstV = 0;
        if (voltage220V != null) {
            int srcV = voltage220V.output220v();
            //转换为5V
            dstV = srcV / 44;
            return dstV;
        }
        return dstV;
    }
}

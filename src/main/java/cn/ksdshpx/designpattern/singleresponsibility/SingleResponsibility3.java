package cn.ksdshpx.designpattern.singleresponsibility;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/13
 * Time: 11:33
 * Description:单一职责原则方式三
 *          方式三的分析：
 *              ①这种修改方法没有对原来的类做大的修改，只是增加方法
 *              ②这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上仍然遵守单一职责
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.roadRun("摩托车");
        vehicle2.airRun("飞机");
        vehicle2.waterRun("轮船");
    }
}

class Vehicle2 {
    public void roadRun(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }

    public void airRun(String vehicle) {
        System.out.println(vehicle + "在天空中运行");
    }

    public void waterRun(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }
}

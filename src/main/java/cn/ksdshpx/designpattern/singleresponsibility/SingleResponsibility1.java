package cn.ksdshpx.designpattern.singleresponsibility;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/13
 * Time: 11:23
 * Description:单一职责原则方式一
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("轮船");
        vehicle.run("飞机");
    }
}

/**
 * 方式1
 * 1.在方式1的run方法中，违反了单一职责原则
 * 2.解决的方案非常的简单，根据交通工具运行方法的不同，分解成不同的类即可
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行！");
    }
}

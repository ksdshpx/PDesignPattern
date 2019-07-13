package cn.ksdshpx.designpattern.singleresponsibility;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/13
 * Time: 11:27
 * Description:单一职责原则方式二
 *          方式二的分析：
 *              ①遵守单一职责原则
 *              ②但是这样做的改动很大，即将类分解，同时修改客户端
 *              ③改进：直接修改Vehicle类，改动的代码会比较少=>方式三
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行！");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println("在空中运行！");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println("在水中运行");
    }
}

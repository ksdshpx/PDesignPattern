package cn.ksdshpx.designpattern.builder.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/12
 * Time: 13:33
 * Description:客户端调用
 */
public class Client {
    public static void main(String[] args) {
        HouseDerictor houseDerictor = new HouseDerictor(new CommonHouseBuilder());
        House house = houseDerictor.buildHouse();
        houseDerictor.setHouseBuilder(new VillaHouseBuilder());
        houseDerictor.buildHouse();
    }
}

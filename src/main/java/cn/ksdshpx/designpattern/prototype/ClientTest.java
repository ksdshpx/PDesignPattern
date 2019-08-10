package cn.ksdshpx.designpattern.prototype;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/10
 * Time: 11:27
 * Description:客户端测试
 */
public class ClientTest {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}

package cn.ksdshpx.designpattern.prototype.improve;


/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/10
 * Time: 11:46
 * Description:客户端测试
 */
public class ClientTest {
    public static void main(String[] args) throws Exception {
        Sheep sheep = new Sheep("Tom", 1, "白色");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}

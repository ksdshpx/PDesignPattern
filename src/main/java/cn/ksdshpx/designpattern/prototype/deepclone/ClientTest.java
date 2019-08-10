package cn.ksdshpx.designpattern.prototype.deepclone;


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
        sheep.setFriend(new Sheep("Jack", 2, "黑色"));
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        System.out.println(sheep + ",sheep.friend:" + sheep.getFriend().hashCode());
        System.out.println(sheep2 + ",sheep2.friend:" + sheep2.getFriend().hashCode());
        System.out.println(sheep3 + ",sheep3.friend:" + sheep3.getFriend().hashCode());
        System.out.println(sheep4 + ",sheep4.friend:" + sheep4.getFriend().hashCode());
        System.out.println(sheep5 + ",sheep5.friend:" + sheep5.getFriend().hashCode());
        Sheep sheep6 = (Sheep) sheep.deepClone();
        Sheep sheep7 = (Sheep) sheep.deepClone();
        System.out.println(sheep6 + ",sheep6.friend:" + sheep6.getFriend().hashCode());
        System.out.println(sheep7 + ",sheep7.friend:" + sheep7.getFriend().hashCode());
    }
}

package cn.ksdshpx.designpattern.template;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/23
 * Time: 14:29
 * Description:客户端
 */
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("---------");
        //制作花生豆浆
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}

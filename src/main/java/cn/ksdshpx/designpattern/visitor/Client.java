package cn.ksdshpx.designpattern.visitor;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/11/2
 * Time: 20:22
 * Description:客户端
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        //成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("-------------");
        //失败
        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}

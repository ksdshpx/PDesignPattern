package cn.ksdshpx.designpattern.dependencyinversion.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/14
 * Time: 9:55
 * Description:依赖倒置原则
 */
public class DependencyInversion2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件消息:hello,email!";
    }
}

class WeiXin implements IReceiver{
    public String getInfo(){
        return "微信消息:hello,wechat!";
    }
}

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}

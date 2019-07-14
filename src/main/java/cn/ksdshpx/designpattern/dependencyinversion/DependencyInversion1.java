package cn.ksdshpx.designpattern.dependencyinversion;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/14
 * Time: 9:55
 * Description:依赖倒置原则
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件消息:hello,email!";
    }
}

//方式1分析
//1.简单，比较容易想到
//2.如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的方法
//3.解决思路：引入一个抽象的接口IReceiver,表示接收者，这样Person类与IReceiver
//发生依赖，因为Email,WeiXin属于接收的范围，他们各自实现IReceiver接口就OK,这样我们就使用依赖倒置原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

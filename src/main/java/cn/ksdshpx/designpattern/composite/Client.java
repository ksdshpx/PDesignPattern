package cn.ksdshpx.designpattern.composite;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/9
 * Time: 18:19
 * Description:客户端访问
 */
public class Client {
    public static void main(String[] args) {
        Organization univercity = new University("东南大学","一流大学");
        Organization computerCollege = new College("计算机学院","计算机学院");
        Organization economyCollege = new College("经济学院","经济学院");
        computerCollege.add(new Department("软件工程","软件工程"));
        computerCollege.add(new Department("网络工程","网络工程"));
        economyCollege.add(new Department("宏观经济学","宏观经济学"));
        economyCollege.add(new Department("微观经济学","微观经济学"));
        univercity.add(computerCollege);
        univercity.add(economyCollege);
        univercity.print();

    }
}

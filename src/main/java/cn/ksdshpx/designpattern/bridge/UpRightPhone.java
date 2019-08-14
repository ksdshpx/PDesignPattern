package cn.ksdshpx.designpattern.bridge;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/14
 * Time: 10:17
 * Description:直立式手机
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立式手机");
    }

    public void call(){
        super.call();
        System.out.println("直立式手机");
    }

    public void close(){
        super.close();
        System.out.println("直立式手机");
    }
}

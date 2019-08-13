package cn.ksdshpx.designpattern.adapter.interfaceadapter;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/13
 * Time: 11:01
 * Description:客户端
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m3() {
                System.out.println("m3");
            }
        };
        absAdapter.m3();
    }
}

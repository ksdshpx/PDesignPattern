package cn.ksdshpx.designpattern.proxy.staticproxy;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/16
 * Time: 10:47
 * Description:客户端调用
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(target);
        teacherDaoProxy.teach();
    }
}

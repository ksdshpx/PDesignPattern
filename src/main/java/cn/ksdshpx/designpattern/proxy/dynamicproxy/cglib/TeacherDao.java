package cn.ksdshpx.designpattern.proxy.dynamicproxy.cglib;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/16
 * Time: 14:37
 * Description:目标对象
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教师上课...");
    }
}

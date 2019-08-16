package cn.ksdshpx.designpattern.proxy.staticproxy;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/16
 * Time: 10:45
 * Description:目标对象
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教师上课...");
    }
}

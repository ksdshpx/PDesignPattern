package cn.ksdshpx.designpattern.proxy.staticproxy;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/16
 * Time: 10:46
 * Description:代理对象
 */
public class TeacherDaoProxy implements ITeacherDao {
    private TeacherDao target;

    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("准备上课资料...");
        target.teach();
        System.out.println("上课结束...");
    }
}

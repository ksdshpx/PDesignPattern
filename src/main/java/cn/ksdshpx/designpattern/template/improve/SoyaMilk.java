package cn.ksdshpx.designpattern.template.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/23
 * Time: 14:20
 * Description:抽象的豆浆类
 */
public abstract class SoyaMilk {
    //模板类
    public final void make() {
        select();
        if (customerWantComdiments()) {
            addComdiments();
        }
        soak();
        beat();
    }

    //选材料
    private void select() {
        System.out.println("第一步：选择新鲜的黄豆...");
    }

    //添加不同的配料
    public abstract void addComdiments();

    //浸泡
    private void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡,需要3小时...");
    }

    //打磨
    private void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎...");
    }

    //钩子方法，决定是否需要添加配料
    protected boolean customerWantComdiments() {
        return true;
    }
}

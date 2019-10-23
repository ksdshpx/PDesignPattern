package cn.ksdshpx.designpattern.template.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/23
 * Time: 14:44
 * Description:纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    public void addComdiments() {

    }

    @Override
    protected boolean customerWantComdiments() {
        return false;
    }
}

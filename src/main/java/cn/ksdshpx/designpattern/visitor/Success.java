package cn.ksdshpx.designpattern.visitor;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/11/2
 * Time: 20:06
 * Description:成功的评价（具体的访问者）
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该歌手很成功！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是该歌手很成功！");
    }
}

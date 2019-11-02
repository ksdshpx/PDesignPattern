package cn.ksdshpx.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/11/2
 * Time: 20:18
 * Description:对象结构,管理了很多的人
 */
public class ObjectStructure {
    //维护了一个Person的集合
    private List<Person> persons = new LinkedList<>();

    //添加到List
    public void attach(Person person) {
        persons.add(person);
    }

    //从List中移除
    public void detach(Person person) {
        persons.remove(person);
    }

    //显示测评的情况
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}

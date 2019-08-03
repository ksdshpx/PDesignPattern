package cn.ksdshpx.designpattern.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/3
 * Time: 20:08
 * Description:迪米特法则升级
 */
public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("使用迪米特法则改进");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院的员工
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理学院员工的管理类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //输入学院员工
    public void printEmployee(){
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

//学校的管理类
//分析SchoolManager的直接朋友类有哪些？Employee、CollegeManager
//而CollegeEmployee不是其直接朋友，而是一个陌生类，违反了迪米特法则
class SchoolManager {
    //返回学院总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部的员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息的方法
    void printAllEmployee(CollegeManager sub) {
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}

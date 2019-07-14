package cn.ksdshpx.designpattern.LiskovSubstitution.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/14
 * Time: 16:13
 * Description:里氏替换原则
 */
public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B(a);
        System.out.println("11-3=" + b.func3(11, 3));
        System.out.println("1-8=" + b.func3(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

class Base {

}

class A extends Base {
    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends Base {
    private A a;

    public B(A a) {
        this.a = a;
    }

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}

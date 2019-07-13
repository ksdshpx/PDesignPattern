package cn.ksdshpx.designpattern.interfacesegregation.implement;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/7/13
 * Time: 16:33
 * Description:接口隔离原则
 */
public class InterfaceSegregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());
    }
}

interface Interface1 {
    void operater1();
}

interface Interface2 {
    void operater2();

    void operater3();
}

interface Interface3 {
    void operater4();

    void operater5();
}

class B implements Interface1, Interface2 {

    @Override
    public void operater1() {
        System.out.println("类B实现了接口interface1.operater1()");
    }

    @Override
    public void operater2() {
        System.out.println("类B实现了接口interface1.operater2()");
    }

    @Override
    public void operater3() {
        System.out.println("类B实现了接口interface1.operater3()");
    }
}

class D implements Interface1, Interface3 {

    @Override
    public void operater1() {
        System.out.println("类D实现了接口interface1.operater1()");
    }

    @Override
    public void operater4() {
        System.out.println("类D实现了接口interface1.operater4()");
    }

    @Override
    public void operater5() {
        System.out.println("类D实现了接口interface1.operater5()");
    }
}

//类A通过接口Interface1依赖类B,但之使用到接口中的1,2,3方法
class A {
    public void depend1(Interface1 i) {
        i.operater1();
    }

    public void depend2(Interface2 i) {
        i.operater2();
    }

    public void depend3(Interface2 i) {
        i.operater3();
    }
}

//类C通过接口Interface1依赖类D,但之使用到接口中的1,4,5方法
class C {
    public void depend1(Interface1 i) {
        i.operater1();
    }

    public void depend2(Interface3 i) {
        i.operater4();
    }

    public void depend3(Interface3 i) {
        i.operater5();
    }
}

package cn.ksdshpx.designpattern.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/16
 * Time: 14:37
 * Description:cglib代理对象工厂
 */
public class ProxyFactory {
    private ITeacherDao target;

    public ProxyFactory(ITeacherDao target) {
        this.target = target;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("准备上课资料...");
                Object returnVal = method.invoke(target);
                System.out.println("上课结束...");
                return returnVal;
            }
        });
        return enhancer.create();
    }
}

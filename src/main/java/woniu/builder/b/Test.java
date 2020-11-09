package woniu.builder.b;

/*
 为了解决a包中的问题（用户知道的太多了），重构代码如下：
 1.把设置对象状态的代码封装起来
 */
class Computer {
    private String cpu;
    private String gpu;
    private String memery;
    private String hd;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMemery() {
        return memery;
    }

    public void setMemery(String memery) {
        this.memery = memery;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memery='" + memery + '\'' +
                ", hd='" + hd + '\'' +
                '}';
    }
}

class ComputerBuilder {
    private Computer c = new Computer();

    public Computer build() {
        c.setCpu("i9 9900");
        c.setGpu("rtx1228ti");
        c.setMemery("16g");
        c.setHd("2T SSD");
        return c;
    }
}

//======================================

public class Test {
    public static void main(String[] args) {
        ComputerBuilder cb = new ComputerBuilder();

        //学习用
        Computer c = cb.build();
        System.out.println(c);

        //娱乐(看电影，扫雷)
        Computer c2 = cb.build();
        System.out.println(c2);

        //玩游戏（3a单机游戏大作）
        Computer c3 = cb.build();
        System.out.println(c3);
    }
}

//优点：
//1.客户端程序员不需要自己手动组装电脑，只需要调用“建造者”的方法即可（相当于电脑城中的装机人员帮你把电脑从头到尾组装好）
//   这样就符合迪米特法则

//缺点：
//2.封装的太狠，不灵活，不能根据用户具体的需求来创建不同的电脑

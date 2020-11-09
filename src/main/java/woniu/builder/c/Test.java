package woniu.builder.c;

/*
 为了解决b包中的问题（封装的太狠，不灵活），重构代码如下：
 1.创建3种级别的建造者：高配 中配 低配
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

class AdvancedComputerBuilder {
    private Computer c = new Computer();

    public Computer build() {
        c.setCpu("i9 9900");
        c.setGpu("rtx1228ti");
        c.setMemery("32g");
        c.setHd("2T SSD");
        return c;
    }
}

class MiddleComputerBuilder {
    private Computer c = new Computer();

    public Computer build() {
        c.setCpu("i7 7700");
        c.setGpu("gtx1060");
        c.setMemery("8g");
        c.setHd("1T SSD");
        return c;
    }
}

class LowComputerBuilder {
    private Computer c = new Computer();

    public Computer build() {
        c.setCpu("i5 6700");
        c.setGpu("gtx512");
        c.setMemery("4g");
        c.setHd("512M SSD");
        return c;
    }
}

//======================================

public class Test {
    public static void main(String[] args) {
        AdvancedComputerBuilder acb = new AdvancedComputerBuilder();
        MiddleComputerBuilder mcb = new MiddleComputerBuilder();
        LowComputerBuilder lcb = new LowComputerBuilder();
        //学习用
        Computer c = acb.build();
        System.out.println(c);

        //娱乐(看电影，扫雷)
        Computer c2 = mcb.build();
        System.out.println(c2);

        //玩游戏（3a单机游戏大作）
        Computer c3 = lcb.build();
        System.out.println(c3);
    }
}

//优点：
//1.现在比较灵活，可以根据不同的需求，选择不同的建造者得到对应的产品

//缺点：
//2.无论是高配、中配、低配，建造过程是一样的，出现了重复的代码，重复出现，就有了坏味道
//  万一装机人员手滑了，或者脑袋突然秀短了一下，忘了某一个步骤，也没有错误提示

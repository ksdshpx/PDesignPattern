package woniu.builder.d;

/*
 为了解决c包中的问题（万一少写某一步骤，也不会报错），重构代码如下：
 1.创建一个建造者接口，目的是为了把建造的过程“稳定住”
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

interface ComputerBuilder {
    void setCpu();

    void setGpu();

    void setMemery();

    void setHd();
}

class AdvancedComputerBuilder implements ComputerBuilder {
    private Computer c = new Computer();

    public Computer build() {
        return c;
    }

    @Override
    public void setCpu() {
        c.setCpu("i9 9900");
    }

    @Override
    public void setGpu() {
        c.setGpu("rtx1228ti");
    }

    @Override
    public void setMemery() {
        c.setMemery("32g");
    }

    @Override
    public void setHd() {
        c.setHd("2T SSD");
    }
}

class MiddleComputerBuilder implements ComputerBuilder {
    private Computer c = new Computer();

    public Computer build() {
        return c;
    }

    @Override
    public void setCpu() {
        c.setCpu("i7 7700");
    }

    @Override
    public void setGpu() {
        c.setGpu("gtx1060");
    }

    @Override
    public void setMemery() {
        c.setMemery("8g");
    }

    @Override
    public void setHd() {
        c.setHd("1T SSD");
    }
}

class LowComputerBuilder implements ComputerBuilder {
    private Computer c = new Computer();

    public Computer build() {
        return c;
    }

    @Override
    public void setCpu() {
        c.setCpu("i5 6700");
    }

    @Override
    public void setGpu() {
        c.setGpu("gtx512");
    }

    @Override
    public void setMemery() {
        c.setMemery("4g");
    }

    @Override
    public void setHd() {
        c.setHd("512M SSD");
    }
}

//======================================

public class Test {
    public static void main(String[] args) {
        AdvancedComputerBuilder acb = new AdvancedComputerBuilder();
        acb.setCpu();
        acb.setGpu();
        acb.setMemery();
        acb.setHd();
        MiddleComputerBuilder mcb = new MiddleComputerBuilder();
        mcb.setCpu();
        mcb.setGpu();
        mcb.setMemery();
        mcb.setHd();
        LowComputerBuilder lcb = new LowComputerBuilder();
        lcb.setCpu();
        lcb.setGpu();
        lcb.setMemery();
        lcb.setHd();
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
//1.现在不同建造者的步骤被固定了下来，建造者必须实现建造者接口

//缺点：
//1.客户端仍然需要知道，安装电脑的具体构成。（这相当于，虽然不是用户亲自动手装电脑，但是用户需要指挥安装人员，该...该...该...）
//2.万一用户少指挥一步，又会出现少一个组件

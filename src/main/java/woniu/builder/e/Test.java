package woniu.builder.e;

/*
 为了解决d包中的问题（客户端仍然需要知道装机的过程），重构代码如下：
 1.创建指挥者，让指挥者把先相同的安装过程封装起来，稳定下来
 2.客户端只调用这个指挥者即可
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

    Computer build();
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

class Director {
    private ComputerBuilder cb;

    public void setCb(ComputerBuilder cb) {
        this.cb = cb;
    }

    public void build() {
        cb.setCpu();
        cb.setGpu();
        cb.setMemery();
        cb.setHd();
    }
}

//======================================

public class Test {
    public static void main(String[] args) {
        AdvancedComputerBuilder acb = new AdvancedComputerBuilder();
        MiddleComputerBuilder mcb = new MiddleComputerBuilder();
        LowComputerBuilder lcb = new LowComputerBuilder();
        Director director = new Director();
        //学习用
        director.setCb(acb);
        director.build();
        Computer c = acb.build();
        System.out.println(c);
        //娱乐(看电影，扫雷)
        director.setCb(lcb);
        director.build();
        Computer c2 = lcb.build();
        System.out.println(c2);
        //玩游戏（3a单机游戏大作）
        director.setCb(mcb);
        director.build();
        Computer c3 = mcb.build();
        System.out.println(c3);
    }
}

//优点：
//1.客户端不知道安装过程，安装过程被封装在指挥者中
//2.安装过程是稳定的，不同配置的电脑，安装过程是一样的，都在指挥者当中稳定住了！
//3.不同产品的安装过程是一样的，这个过程只写了一次，从而提高了代码的重用性

//缺点：
//1.客户端仍然需要知道，安装电脑的具体构成。（这相当于，虽然不是用户亲自动手装电脑，但是用户需要指挥安装人员，该...该...该...）
//2.万一用户少指挥一步，又会出现少一个组件

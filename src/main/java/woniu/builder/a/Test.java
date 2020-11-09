package woniu.builder.a;

/*
有一个电脑类，要求创建出电脑的实例，并初始化对象的状态（对象的状态就是对象的属性）
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

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setCpu("i9 9900");
        c.setGpu("rtx1228ti");
        c.setMemery("16g");
        c.setHd("2T SSD");
        System.out.println(c);
    }
}

//目前，以上代码倒是满足了需求
//缺点：
//1.客户端程序员需要自己“手动”初始化实例的各种状态，这样不好，违反了迪米特法则（相当于用户去了电脑城，商家把一堆硬件摆出来，让用户自己组装）

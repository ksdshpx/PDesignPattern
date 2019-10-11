package cn.ksdshpx.designpattern.facade;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/10/11
 * Time: 9:50
 * Description:门面
 */
public class HomeTheaterFacade {
    //定义各个子系统的对象
    private TheaterLight theaterLight;
    private Stereo stereo;
    private Screen screen;
    private Projector projector;
    private PopCorn popCorn;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
        this.projector = Projector.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分成4部
    public void ready(){
        popCorn.on();
        popCorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.paly();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popCorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}

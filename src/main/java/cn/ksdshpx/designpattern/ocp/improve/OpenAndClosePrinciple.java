package cn.ksdshpx.designpattern.ocp.improve;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/2
 * Time: 14:04
 * Description:开闭原则升级
 */
public class OpenAndClosePrinciple {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    int sm_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle(){
        super.sm_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    public Circle(){
        super.sm_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {
    public Triangle(){
        super.sm_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

//新增其他
class OtherGraphic extends Shape{
    public OtherGraphic(){
        super.sm_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}

package cn.ksdshpx.designpattern.ocp;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/8/2
 * Time: 14:04
 * Description:开闭原则
 */
public class OpenAndClosePrinciple {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        if(s.sm_type == 1){
            drawRectangle();
        }else if(s.sm_type == 2){
            drawCircle();
        }else if(s.sm_type == 3){
            drawTriangle();
        }
    }

    public void drawRectangle(){
        System.out.println("绘制矩形");
    }

    public void drawCircle(){
        System.out.println("绘制圆形");
    }

    public void drawTriangle(){
        System.out.println("绘制三角形");
    }
}

class Shape{
    int sm_type;
}

class Rectangle extends Shape{
    public Rectangle(){
        super.sm_type = 1;
    }
}

class Circle extends Shape{
    public Circle(){
        super.sm_type = 2;
    }
}

//新增三角形
class Triangle extends Shape{
    public Triangle(){
        super.sm_type = 3;
    }
}

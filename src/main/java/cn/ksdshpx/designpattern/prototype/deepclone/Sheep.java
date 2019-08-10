package cn.ksdshpx.designpattern.prototype.deepclone;

import java.io.*;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/8/10
 * Time: 11:44
 * Description:羊实体
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private String color;
    private String address = "蒙古羊";
    private Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //深拷贝方式1:利用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = super.clone();
        Sheep sheep = (Sheep) deep;
        if (sheep.getFriend() != null) {
            sheep.setFriend((Sheep) sheep.getFriend().clone());
        }
        return sheep;
    }

    //深拷贝方式2:利用序列化与反序列化(推荐使用)
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化当前对象
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep copySheep = (Sheep) ois.readObject();
            return copySheep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

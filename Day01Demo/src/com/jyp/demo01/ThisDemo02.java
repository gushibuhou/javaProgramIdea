package com.jyp.demo01;

/**
 * @title: ThisDemo02类
 * @Author jiangyp
 * @Date: 2021/12/16 14:33:55
 * @Version 1.0
 */

/**
 * 2.1 this关键字的作用：
 *         this代表了当前对象的引用。
 *         this关键字可以用在实例方法和构造器中。
 *         this用在方法中，谁调用这个方法，th就代表谁。
 *         this用在构造器，代表了构造器正在初始化的那个对象的引用。
 */
public class ThisDemo02 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("金毛");
    }
}
class Animal{
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     * animal.setName("金毛");
     */
    public void setName(String name) {
        //谁调用这个方法,this就代表谁!!!
        this.name = name;//animal.name = "金毛"
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
package com.jyp.demo01;

/**
 * @title: ClassDemo01类
 * @Author jiangyp
 * @Date: 2021/12/16 10:49:56
 * @Version 1.0
 */

/**
 * 1.类中的成分研宄：
 *     1.1类中有且仅有五大成分（五大金刚）
 *         1·成员变量(Fie1d：描述类和对象的属性信息的）.
 *         2·成员方法（Method：描述类或者对象的行为信息的）
 *         3·构造器（Constructor：初始化一个类的对象并返回引用）
 *         4·代码块
 *         5·内部类
 *     注意：只要不是这5大成分放在类下就会报错.
 *     1.2构造器的复习
 *        作用：初始化一个类的对象并返回引用。
 *        格式：
 *        修饰符类名（形参）{
 *        构造器初始化对象的格式：
 *        类名对象名称=new构造器；
 *        注意：
 *        一个类默认会自带一个无参数构造器，即使不写它也存在，但是如果一个类
 *        它写了一个构造器，那么默认的无参数构造器就被覆盖了！！
 */
public class ClassDemo01 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
    }
}
/**
 * 内部类
 */
class Student{

}

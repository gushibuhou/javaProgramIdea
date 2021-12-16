package com.jyp.demo01;

/**
 * @title: Package03类
 * @Author jiangyp
 * @Date: 2021/12/16 15:40:28
 * @Version 1.0
 */

/**
 * 封装的作用：
 *         1.可以提高安全性
 *         2.可以实现代码的组件化
 *     封装的规范：
 *         1.建议成员变量都私有：用private修饰
 *             private修饰的方法，成员变量，构造器等只能在本类被直接访问
 *         2.提供成套的getter+setter方法暴露成员变量的取值和赋值
 *             public修饰符，是公开的意义。
 *     小结：
 *         封装的核心思想：合理隐藏，合理暴露
 *         封装己经成为Java代码的风格，即使代码毫无意义，还是要按照封装的规范写代码。
 *             成员变量私有，提供getter+setter方法
 */
public class Package03 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
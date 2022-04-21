package com.demo.entity;

/**
 * @author ldz
 * @description 测试三名学生的反射对象以及加载类分别为什么
 */
public class Tstudent {
    public static void main(String[] args) {
        //创建3个学生对象
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student.setName("张三");
        student2.setName("李四");
        //输出三个学生对象的地址
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        //获取3个学生的反射对象
        Class<? extends Student> aClass = student.getClass();
        Class<? extends Student> aClass2 = student2.getClass();
        Class<? extends Student> aClass3 = student3.getClass();
        System.out.println(aClass);
        System.out.println(aClass2);
        System.out.println(aClass2);
        //获取3个学生的装在类
        ClassLoader classLoader = aClass.getClassLoader();
        ClassLoader classLoader2 = aClass2.getClassLoader();
        ClassLoader classLoader3 = aClass3.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader2);
        System.out.println(classLoader3);
    }
}

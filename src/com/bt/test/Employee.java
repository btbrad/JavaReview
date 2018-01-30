package com.bt.test;

/**
 * <p>类描述：
 * <pre>
 * 改动说明：
 *      【修改人：卞涛 / 2018年01月30日 / 版本：1.0】
 *
 * </pre>
 *
 * @author 卞涛
 * @version 1.0
 * @since 2018年01月30日
 */
public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    protected String b = "PC";
    private static int count = 0;
    private static void addChild(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Employee(String name) {
        this.name = name;
        addChild();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }

}

package day07;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
 * 实现序列化接口，并定义版本号。
 * @author Bonnie
 *
 */
public class Emp implements Serializable {
    private static final long serialVersionUID = 123456789;
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;//入职时间

    @Override
    public String toString() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.hiredate);
        return "姓名:" + this.name + ",年龄:" + this.age + ",性别:" + this.gender + ",薪资:" + this.salary + ",入职时间:" + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE);
    }

    @Override
    public boolean equals(Object obj) {
        Emp o = (Emp) obj;
        // 要求名字，年龄，性别，薪资都相同
        return ((this.name.equals(o.name)) && (this.age == o.age) && (this.gender.equals(o.gender)) && (this.salary == o.salary));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}

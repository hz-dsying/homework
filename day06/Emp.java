package day06;

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
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp implements Comparable<Emp> {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;//入职时间

    public Emp(){

    }
    public Emp(String name, int age, String gender, int salary, Date hiredate){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public boolean equals(Object obj) {
        Emp oo = (Emp) obj;
        return this.name.equals(oo.name);
    }

    @Override
    public String toString() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.hiredate);
        return this.name + "," + this.age + "," + this.gender + "," + this.salary + "," + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE);
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

    @Override
    public int compareTo(Emp o) {
        return this.getAge() - o.getAge();
    }
}

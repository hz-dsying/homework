package day05;

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
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
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
    @Override
    public boolean equals(Object obj) {
        Emp oo = (Emp) obj;
        if(this.name.equals(oo.name) && String.valueOf(this.age).equals(String.valueOf(oo.age))){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.hiredate);
        //姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
        return "姓名:" + this.name + ",年龄:" + this.age + ",性别:" + this.gender + ",薪资:" + this.salary + ",入职时间:" + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE);
    }

    @Override
    //比较规则为年龄小的人小
    public int compareTo(Emp o) {
//        if (o.age < this.age){
////            return 1;
////        }else if (o.age > this.age){
////            return -1;
////        }
        return this.age - o.age;
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

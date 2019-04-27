package day02;
/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * 定义全参数(该构造方法的参数用于设置所有属性)构造方法与默认构造方法
 * 重写toString方法，返回字符串格式如:"张三,25,男,5000"
 * 重写equals方法，要求名字相同就认为内容一致。
 * @author Bonnie
 *
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private int salary;
    public Person(){

    }

    @Override
    //重写equals方法，要求名字相同就认为内容一致。
    public boolean equals(Object obj) {
        Person per = (Person) obj;
        if (name == per.name)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return name+","+age+","+gender+","+salary;
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
}

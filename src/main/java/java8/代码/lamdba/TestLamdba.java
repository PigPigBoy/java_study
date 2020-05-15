package java8.代码.lamdba;

import java8.bean.Employee;
import org.junit.Test;

import java.util.*;

/**
 * @author: KongKongBaby
 * @create: 2020-05-15 00:05
 * @description: 简写了匿名内部类
 **/

public class TestLamdba {

    static List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9990.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("田七", 8, 7777.77)
    );

    /**
     * @author: jiacheng.xing
     * @Date: 2020.05.15 00:27
     * @Description: 匿名内部类
     */

    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    @Test
    public void test3() {
        List<Employee> list = filterEmployees(TestLamdba.employees);
        list.forEach(System.out::println);
    }

    //获取当前公司员工年龄>35的员工信息
    public List<Employee> filterEmployees(List<Employee> list) {
        List<Employee> emps = new ArrayList<>();
        for (Employee e : list) {
            if (e.getAge() >= 35)
                emps.add(e);
        }
        return emps;
    }

    //获取当前公司员工工资>5000的员工信息
    public List<Employee> filterEmployees2(List<Employee> list) {
        List<Employee> emps = new ArrayList<>();
        for (Employee e : list) {
            // 发现与上述方法唯一区别就是这里，导致上下很多冗余代码
            // 优化方案： 通过设计模式，将该功能提取出一个接口
            if (e.getSalary() >= 5000)
                emps.add(e);
        }
        return emps;
    }

    //----------------优化方案1：策略模式-----------------
    @Test
    public void test4() {
        // 存在问题： 类过多
        System.out.println("----------------优化方案1：策略模式-----------------");
        System.out.println("按年龄进行筛选");
        List<Employee> list1 = filterEmployee(TestLamdba.employees, new FilterEmployeeByAge());
        list1.forEach(System.out::println);
        System.out.println("按薪资进行筛选");
        List<Employee> list2 = filterEmployee(TestLamdba.employees, new FilterEmployeeBySalary());
        list2.forEach(System.out::println);
    }

    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp) {
        List<Employee> emps = new ArrayList<>();
        for (Employee e : list) {
            if (mp.filter(e))
                emps.add(e);
        }
        return emps;
    }

    //----------------优化方案2：匿名内部类-----------------
    @Test
    public void test5() {
        System.out.println("----------------优化方案2：匿名内部类-----------------");
        List<Employee> list = filterEmployee(TestLamdba.employees, new MyPredicate<Employee>() {
            @Override
            public boolean filter(Employee employee) {
                return employee.getSalary() <= 5000;
            }
        });
        System.out.println("按薪资筛选");
        list.forEach(System.out::println);
    }

    //----------------优化方案3：lamdba表达式-----------------
    @Test
    public void test6() {
        System.out.println("----------------优化方案3：lambda表达式-----------------");
        List<Employee> list = filterEmployee(TestLamdba.employees, employee -> employee.getSalary() >= 5000);
        System.out.println("按薪资筛选");
        list.forEach(System.out::println);
    }

    //----------------优化方案4：stream-----------------
    @Test
    public void test7() {
        System.out.println("----------------优化方案4：stream-----------------");
        System.out.println("按薪资筛选");
        employees.stream().filter(e -> e.getSalary() >= 5000).limit(2).forEach(System.out::println);
    }
}

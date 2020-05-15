package java8.代码.lamdba;

import java8.bean.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author: KongKongBaby
 * @create: 2020-05-15 01:22
 * @description:
 **/

public class TestLambda2 {
    static List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9990.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("田七", 8, 7777.77)
    );

    @Test
    public void test1() {
        Collections.sort(employees,(e1,e2)->{
            // 先按照年龄排序,如果年龄一样按姓名比较
            if (e1.getAge() == e2.getAge())
                return e1.getName().compareTo(e2.getName());
            else
                return -Integer.compare(e1.getAge(),e2.getAge());
        });
        employees.forEach(System.out::println);
    }

    @Test
    public void test2(){
        System.out.println(strHandler("hello world", str -> str.toUpperCase() + 123));
    }
    public String strHandler(String str,MyFunc mf){
        return mf.getValue(str);
    }
}

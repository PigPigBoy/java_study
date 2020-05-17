package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: KongKongBaby
 * @create: 2020-05-15 00:29
 * @description: 员工实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
    }
}

package java8.代码.lamdba;

import java8.bean.Employee;

/**
 * @author: KongKongBaby
 * @create: 2020-05-15 00:52
 * @description:
 **/

public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean filter(Employee employee) {
        return employee.getAge() >= 35;
    }
}

package java8.代码.lamdba;

import bean.Employee;

/**
 * @author: KongKongBaby
 * @create: 2020-05-15 00:59
 * @description:
 **/

public class FilterEmployeeBySalary implements MyPredicate<Employee> {
    @Override
    public boolean filter(Employee employee) {
        return employee.getSalary() >= 5000;
    }
}

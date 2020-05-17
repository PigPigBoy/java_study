package enums;

import bean.Employee;
import org.junit.Test;
import response.Response;

import java.util.Arrays;
import java.util.List;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 09:35
 * @description: 测试枚举类
 **/

public class ResponseCodeTest {
    static List<Employee> res = Arrays.asList(
            new Employee("张三", 18, 9990.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("田七", 8, 7777.77)
    );

    @Test
    public void test1() {
        Response<List<Employee>> response = getAllEmployee();
        System.out.println(response);
    }

    public List<Employee> queryEmployeeList() {
        return res;
    }

    public Response<List<Employee>> getAllEmployee() {
        List<Employee> list = queryEmployeeList();
        return new Response<>(ResponseCodeEnum.SUCCESS, list);
    }
}

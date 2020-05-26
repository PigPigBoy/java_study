package designmode.七大原则.单一职责原则;

import org.junit.Test;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 11:21
 * @description:
 **/

public class Test1 {
    @Test
    public void test1(){
        // 违反了单一职责原则
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

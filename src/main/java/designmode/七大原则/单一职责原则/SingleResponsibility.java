package designmode.七大原则.单一职责原则;

import org.junit.Test;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 11:25
 * @description:
 **/

public class SingleResponsibility {

    // 方案2 遵守了单一职责 但是这样做改动花销很大: 将类分解同时修改客户端
    @Test
    public void test1(){
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();

        roadVehicle.run("摩托车");
        airVehicle.run("飞机");
        waterVehicle.run("船");
    }

    // 方案3 相比方案二修改量减少 但没完全遵守了单一职责 没有在类级别遵守 仅在方法级别遵守
    @Test
    public void test2(){
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("船");
    }
}
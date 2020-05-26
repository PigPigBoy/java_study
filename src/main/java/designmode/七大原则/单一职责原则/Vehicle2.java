package designmode.七大原则.单一职责原则;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 11:20
 * @description:
 **/

public class Vehicle2 {
    public void runRoad(String vehicle){
        System.out.println(vehicle+"\t在公路上运行");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle+"\t在天空上运行");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle+"\t在水中运行");
    }
}

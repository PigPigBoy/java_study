package designmode.工厂模式.工厂方法模式;

import designmode.工厂模式.简单工厂模式.Fruit;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 00:53
 * @description:
 **/

public class Pear implements Fruit {
    @Override
    public void get() {
        System.out.println("采集梨子");
    }
}

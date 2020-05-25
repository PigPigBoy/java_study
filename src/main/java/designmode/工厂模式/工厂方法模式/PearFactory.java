package designmode.工厂模式.工厂方法模式;

import designmode.工厂模式.简单工厂模式.Banana;
import designmode.工厂模式.简单工厂模式.Fruit;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 01:03
 * @description:
 **/

public class PearFactory implements AbstractFruitFactory{
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}

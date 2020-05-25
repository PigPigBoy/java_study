package designmode.工厂模式.工厂方法模式;

import designmode.工厂模式.简单工厂模式.Apple;
import designmode.工厂模式.简单工厂模式.Fruit;
import lombok.experimental.Accessors;
import sun.security.krb5.internal.APOptions;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 00:57
 * @description:
 **/

public class MainClass {
    public static void main(String[] args) throws Exception{
//        Fruit apple = FruitFactory.getFruit("apple");
//        Fruit banana = FruitFactory.getFruit("banana");
//        Fruit pear = FruitFactory.getFruit("pear");
//        Fruit other = FruitFactory.getFruit("other");
//
//        apple.get();
//        banana.get();
//        pear.get();

        // 升级版
        AbstractFruitFactory f1 = new AppleFactory();
        Apple apple = (Apple) f1.getFruit();
        apple.get();

    }
}

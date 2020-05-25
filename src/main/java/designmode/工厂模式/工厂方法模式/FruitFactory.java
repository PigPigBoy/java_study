package designmode.工厂模式.工厂方法模式;

import designmode.工厂模式.简单工厂模式.Apple;
import designmode.工厂模式.简单工厂模式.Banana;
import designmode.工厂模式.简单工厂模式.Fruit;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 00:52
 * @description:
 **/

public class FruitFactory {
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
        if ("apple".equalsIgnoreCase(type))
            return Apple.class.newInstance();
        if ("banana".equalsIgnoreCase(type))
            return Banana.class.newInstance();
        // 如果我要新加一个梨子，那就要修改以前的代码：增加以下代码：
        if ("pear".equalsIgnoreCase(type))
            return Pear.class.newInstance();
        System.out.println(type+"找不到对应的实例化类");
        return null;
    }
}

package designmode.工厂模式.抽象工厂模式;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 10:30
 * @description:
 **/

public class SouthFruitFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}

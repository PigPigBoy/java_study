package designmode.工厂模式.抽象工厂模式;

/**
 * @author: KongKongBaby
 * @create: 2020-05-26 10:31
 * @description:
 **/

public class MainClass {
    public static void main(String[] args) {
        FruitFactory ff = new NorthFruitFactory();
        FruitFactory sf = new SouthFruitFactory();
        Fruit apple = ff.getApple();
        Fruit apple2 = sf.getApple();
        apple.get();
        apple2.get();

        Fruit banana = ff.getBanana();
        Fruit banana2 = sf.getBanana();
        banana.get();
        banana2.get();
    }
}

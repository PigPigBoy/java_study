package designmode.工厂模式.简单工厂模式;

/**
 * @author: KongKongBaby
 * @create: 2020-05-25 22:40
 * @description:
 **/

public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,ClassNotFoundException {
//        Apple apple = new Apple();
//        Banana banana = new Banana();
//        apple.get();
//        banana.get();

//        Fruit apple = new Apple();
//        Fruit banana = new Banana();
//        apple.get();
//        banana.get();

//        FruitFactory fruitFactory = new FruitFactory();
//        Fruit apple = fruitFactory.getApple();
//        Fruit banana = fruitFactory.getBanana();
//        apple.get();
//        banana.get();

//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();

//        Fruit apple = FruitFactory.getFruit("apple");
//        Fruit banana = FruitFactory.getFruit("banana");
//        Fruit other = FruitFactory.getFruit("other");
//        apple.get();
//        banana.get();

        Fruit apple = FruitFactory.getFruit("designmode.工厂模式.简单工厂模式.Apple");
        Fruit banana = FruitFactory.getFruit("designmode.工厂模式.简单工厂模式.Banana");
        apple.get();
        banana.get();
    }
}
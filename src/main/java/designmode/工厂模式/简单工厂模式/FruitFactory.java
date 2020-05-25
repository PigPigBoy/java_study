package designmode.工厂模式.简单工厂模式;

/**
 * @author: KongKongBaby
 * @create: 2020-05-25 22:49
 * @description:
 **/

public class FruitFactory {
//    //获得实例
//    public static Fruit getApple(){
//        return new Apple();
//    }
//
//    public static Fruit getBanana(){
//        return new Banana();
//    }

    // 升级
    // get所有产品对象
//    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
//        if (type.equalsIgnoreCase("apple"))
//            return Apple.class.newInstance();
//
//        if (type.equalsIgnoreCase("banana"))
//            return Banana.class.newInstance();
//        System.out.println(type+"找不到相应的类");
//        return null;
//    }

    //再次升级
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}
